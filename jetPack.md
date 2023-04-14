
JVM需要加上, 应该android项目会自动寻找，JVM则不行

```kotlin
publishing {
    publications {
        create("maven_public", MavenPublication::class) {
            groupId = "com.github.hqqich"
            artifactId = "library"
            version = "1.0.4"
            from(components.getByName("java"))
        }
    }
}
```