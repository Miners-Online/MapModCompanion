plugins {
    id("java-shadow")
}

repositories {
    maven {
        name = "Sonatype"
        url = uri("https://oss.sonatype.org/content/repositories/snapshots/")
    }
}

tasks {
    val writeBungeeYml by creating(PluginDescriptorTask::class) {
        descriptor = "bungee.yml"
        content.putAll(mapOf(
                "name" to "MapModCompanion",
                "version" to project.version,
                "author" to "turikhay",
                "main" to "com.turikhay.mc.mapmodcompanion.bungee.MapModCompanion"
        ))
    }
}

dependencies {
    implementation(project(":common"))
    implementation(libs.bstats.bungeecord)
    compileOnly("net.md-5:bungeecord-api:1.19-R0.1-SNAPSHOT")
}
