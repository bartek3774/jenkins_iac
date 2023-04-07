import groovy.json.JsonSlurper

def config_root_path = "${WORKSPACE}/jobs_config"

def tree_command = "tree -J ${config_root_path}"

def getJsonConfigTree(command) {
    def tree = ['bash', '-c', "${command}"].execute().text
    return new JsonSlurper().parseText(tree)
}


def jsonProjectStruct = getJsonConfigTree(tree_command)

println getJsonConfigTree(tree_command)