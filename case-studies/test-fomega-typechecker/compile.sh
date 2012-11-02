#!/bin/bash

if [ $# -lt 1 ]; then
    echo "Usage: compile.sh <file>"
    exit 1
fi
file=$1

dir=${0%/*}

sugarj=$dir/../../deployment/cli-scripts/sugarj-dev

opts="-l fomega \
--cache $dir/.sugarjcache \
--sourcepath $dir/src \
-d $dir/bin \
-cp $dir/bin"

exec $sugarj $opts $file
