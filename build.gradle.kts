import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile
import org.jetbrains.kotlin.gradle.tasks.KotlinJsDce

val DCE_ENABLED = true

group = "ee.urgas"
version = "0.1"


plugins {
    id("kotlin2js") version("1.3.31")
    id("kotlin-dce-js") version("1.3.31")
}

repositories {
    mavenCentral()
    maven("https://dl.bintray.com/rjaros/kotlin")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-js")
    implementation("pl.treksoft:jquery-kotlin:0.0.4")
    testCompile("junit:junit:4.11")
    testImplementation("org.jetbrains.kotlin:kotlin-test-js")
}

tasks.named<Kotlin2JsCompile>("compileKotlin2Js").get()
    .kotlinOptions {
        sourceMap = true
    }

tasks.named<KotlinJsDce>("runDceKotlinJs").get()
    .dceOptions {
        devMode = !DCE_ENABLED
    }
