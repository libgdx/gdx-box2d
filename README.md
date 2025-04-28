## gdx-box2d

This project contains java bindings for the v3.1.0 release of [Box2D](https://github.com/erincatto/box2d).  
The project is build from commit [0f2b0246f39594e93fcc8dde0fe0bb1b20b403f9](https://github.com/erincatto/box2d/tree/0f2b0246f39594e93fcc8dde0fe0bb1b20b403f9).

> [!CAUTION]
> The API is considered incubating and may change at any point.

## Installation

The current version is: 3.1.0-0

gdx-box2d provides the following artifacts:
- `com.badlogicgames.gdx:gdx-box2d:$version`
- `com.badlogicgames.gdx:gdx-box2d-platform:$version:natives-desktop`
- `com.badlogicgames.gdx:gdx-box2d-platform:$version:natives-ios`
- `com.badlogicgames.gdx:gdx-box2d-platform:$version:natives-arm64-v8a`
- `com.badlogicgames.gdx:gdx-box2d-platform:$version:natives-armeabi-v7a`
- `com.badlogicgames.gdx:gdx-box2d-platform:$version:natives-x86`
- `com.badlogicgames.gdx:gdx-box2d-platform:$version:natives-x86_64`

Additionally, the following utility artifact is provided:
- `com.badlogicgames.gdx:gdx-box2d-utils:$version`

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

## Deviation from box2d
The following changes have been applied that are more than sole bindings:
- On initialization a custom routine for assertion handling gets installed. This will throw the assertion as an `Box2DAssertionError`.  
    The behaviour can be overwritten with `b2SetAssertFcn`, see the box2d docs for more infos.


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
