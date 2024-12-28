## gdx-box2d

This project contains java bindings for the v3 release of [Box2D](https://github.com/erincatto/box2d).  
The project is build from commit [f377034920c42a26cd498c0a0b1b2e9f2b064989](https://github.com/erincatto/box2d/tree/f377034920c42a26cd498c0a0b1b2e9f2b064989).

## Installation

The current version is: 0.1-SNAPSHOT

gdx-box2d provides the following artifacts:
- `com.badlogicgames.gdx:gdx-box2d:$version`
- `com.badlogicgames.gdx:gdx-box2d-platform:$version:natives-desktop`
- `com.badlogicgames.gdx:gdx-box2d-platform:$version:natives-ios`
- `com.badlogicgames.gdx:gdx-box2d-platform:$version:natives-arm64-v8a`
- `com.badlogicgames.gdx:gdx-box2d-platform:$version:natives-armeabi-v7a`
- `com.badlogicgames.gdx:gdx-box2d-platform:$version:natives-x86`
- `com.badlogicgames.gdx:gdx-box2d-platform:$version:natives-x86_64`

## Usage

At first, you need to call `com.badlogic.gdx.box2d.Box2d#initialize`. This will load the shared libraries and set up the native code.  
After that, `com.badlogic.gdx.box2d.Box2d` provides all entry points into Box2D.

### Closure
Closures can be allocated with `ClosureObject#fromClosure`.

### Memory handling
Structs and Pointer are part of the java GC cycle. If a struct/pointer gets allocated in java, it will be freed once the GC collects the java object.  
All pointer types provide constructors to make them not freed by GC. You need to free those manually.  
Closures always need to be freed manually.  
If a box2d method returns a pointer, it will not be registered for GC.  

## Java 8
The project needs java 8 language features to build. However, it doesn't use any java 8 APIs and is therefor still safe to use with mobiVM.

## Supported OS

Windows:
- i686
- x86_64

MacOS:
- x86_64
- arm64

Linux:
- arm
- arm64
- x86_64
- riscv64

iOS:
- arm64 iphoneos
- arm64 iphonesimulator
- x86_64 iphonesimulator

Android:
- arm64-v8a
- armeabi-v7a
- x86
- x86_64