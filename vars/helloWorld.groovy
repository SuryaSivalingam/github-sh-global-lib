def call(String name="Joe") {
    //Map config = [:]
    //sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
    sh "echo Hello. My name is ${name}"
}
