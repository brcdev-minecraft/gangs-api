# gangs-api

![GitHub release](https://img.shields.io/github/release/brcdev-minecraft/gangs-api)
![GitHub](https://img.shields.io/github/license/brcdev-minecraft/gangs-api)
![GitHub last commit](https://img.shields.io/github/last-commit/brcdev-minecraft/gangs-api)

This repository provides an open source library containing basic API
for [Gangs+](https://www.spigotmc.org/resources/gangs-1-8-1-19.2604/) spigot plugin.


## How to use

1. Add Maven/Gradle dependency to your project (code snippets are available in the section below)
2. Add `GangsPlus` to `depend` or `softdepend` section of `plugin.yml` in your plugin project
3. You can start adding desired implementation to your plugin

## Version compatibility matrix

When using this API, make sure you use valid version corresponding to Gangs+'s version your plugin is going to be used
with.

| Gangs+ version  | API version |
|-----------------| --- |
| 2.0.0 - ...     | 1.0.0


## Dependencies

_Note: It's not recommended to use the `latest` version tag. Use fixed version
from [Releases](https://github.com/brcdev-minecraft/gangs-api/releases) instead._

### Maven

```
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

```
	<dependency>
	    <groupId>com.github.brcdev-minecraft</groupId>
	    <artifactId>gangs-api</artifactId>
	    <version>latest</version>
	    <scope>provided</scope>
	</dependency>
```

### Gradle

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

```
	dependencies {
	        compileOnly 'com.github.brcdev-minecraft:gangs-api:latest'
	}
```

## Contact

You can contact the maintainers at our Discord server - http://discord.brcdev.net/
