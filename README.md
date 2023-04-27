

## 使用

#### maven
```xml
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>
```
```xml
<dependency>
    <groupId>com.github.hqqich</groupId>
    <artifactId>hqqich-util</artifactId>
    <version>v1.0.4</version>
</dependency>
```

#### gradle
```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
```groovy
dependencies {
    implementation 'com.github.hqqich:hqqich-util:v1.0.4'
}
```


## 功能

- [x] 扩展Boolean
- [ ] 