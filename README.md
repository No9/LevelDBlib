# leveldown-mobile

## Introduction

This is a fork of LevelDbLib that aims to provide full leveldown on Android and IOS.
It will probably use some sort of phonegap-esc approach to provide a javascript runtime to leverage the level-* stack. However the aim is to bypass the browser restrictions on file size and the lack of indexeddb capability on the current set of native phone browsers. 

## Build 

Install the android native development toolkit. Version used : android-ndk-r8e
Setup your environments to point to the android-ndk-r8e Folder

```exports PATH=$PATH:/PATHTOINSTALLFOLDER```

Then check out this repo. cd into the top level folder and and run ./build.sh

```
git clone git://github.com/No9/leveldown-mobile.git
cd leveldown-mobile
./build.sh
```
## Notes 

The level-* integration is WIP.
Currently depends on node-leveldown v0.6.0
