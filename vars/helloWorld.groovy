def call(Map config = [:]) {
    //Map config = [:]
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
    //sh "echo Hello. My name is ${name}"
}
