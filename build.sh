#! /usr/bin/env bash

#version=$1
version=leveldb-1.11.0

git submodule --init
cp ../node-leveldown/deps/leveldb/$version