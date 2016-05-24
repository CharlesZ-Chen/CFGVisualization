#!/bin/bash

# first change to script directory so relative path works again
cd $(dirname "$0")

export TRAVIS_BUILD_DIR=$(pwd)

. ./.travis-build-without-test.sh
