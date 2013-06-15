#! /usr/bin/env bash

version=leveldb-1.11.0

git submodule init
git submodule update
cp ./node-leveldown/deps/leveldb/$version/db . -fr
cp ./node-leveldown/deps/leveldb/$version/doc . -fr
cp ./node-leveldown/deps/leveldb/$version/helpers . -fr
cp ./node-leveldown/deps/leveldb/$version/include . -fr
cp ./node-leveldown/deps/leveldb/$version/issues . -fr
cp ./node-leveldown/deps/leveldb/$version/table . -fr
cp ./node-leveldown/deps/leveldb/$version/util . -fr
ndk-build
