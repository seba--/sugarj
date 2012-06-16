#!/bin/sh

SERVER=login.mathematik.uni-marburg.de
DIR=public_html/projects/sugarj/update/haskell

rsync -av . $SERVER:$DIR
