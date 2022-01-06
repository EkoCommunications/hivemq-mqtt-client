plugins {
    id("java")
}


/* ******************** metadata ******************** */

description = "Examples using the HiveMQ MQTT Client"

metadata {
    moduleName.set("com.hivemq.client.mqtt.examples")
    readableName.set("HiveMQ MQTT Client examples")
}


/* ******************** dependencies ******************** */

dependencies {
    implementation(rootProject)
    implementation ("net.sourceforge.streamsupport:android-retrostreams:1.7.4")
    implementation ("net.sourceforge.streamsupport:android-retrofuture:1.7.4")
}
