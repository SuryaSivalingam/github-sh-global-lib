def call(Map config = [:]) {
    //Map config = [:]
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
    sh "echo I'm working in ${config.company}"
    //sh "echo Hello. My name is ${name}"
}
