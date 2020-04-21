package com.typedpath.iam2kotlin

/**
 * see  https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html
 **/

class IamPolicy(init: IamPolicy.() -> Unit = {}) {

    open class Action(val id: String)
    open class Resource(val specification: String) {
        companion object {
            val All = Resource("*")
        }
    }

    var Version = "2012-10-17"

    //TODO resolve why these stop cloudformation working !
    var Id: String? = null
    var Sid: String? = null

    //effect
    enum class EffectType { Allow, Deny }

    var Statement: MutableList<StatementEntry> = mutableListOf()

    fun statement(init: StatementEntry.() -> Unit) {
        val statement = StatementEntry()
        statement.apply(init)
        Statement.add(statement)
    }

    class StatementEntry {
        var effect: EffectType? = null

        //TODO constant star action
        //e.g. "action": [ "sqs:SendMessage", "sqs:ReceiveMessage", "ec2:StartInstances", "iam:ChangePassword", "s3:GetObject" ]
        var action: MutableList<String> = mutableListOf()
        var noAction: MutableList<String> = mutableListOf()

        //resource
        var Condition: List<ConditionMapEntry>? = mutableListOf()

        var resource: MutableList<String> = mutableListOf()
        var notResource: MutableList<String> = mutableListOf()

        //TODO constant star principal block
        //var principal: List<PrincipalMapEntry>? = null
        var principal: MutableMap<PrincipalType, List<String>>? = null
        var notPrincipal: MutableMap<PrincipalType, List<String>>? = null

        fun action(action: Action) {
            this.action.add(action.id)
        }

        fun resource(resource: Resource) {
            this.resource.add(resource.specification)
        }
    }

    enum class PrincipalType() {
        AWS, Federated, Service;
    }

    class PrincipalMapEntry(val Type: PrincipalType, val PrincipalIds: List<String>) {
    }

    class ConditionMapEntry(val type: String, val values: List<ConditionValuePair>) {}
    class ConditionValuePair(val key: String, val values: Any) {}

    init {
        init()
    }

}
