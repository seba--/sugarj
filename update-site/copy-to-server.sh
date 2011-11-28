#!/bin/sh

DESTDIR=/Volumes/seba\@login/public_html/projects/sugarj/update

cp -Rn features/* $DESTDIR/features
cp -Rn plugins/* $DESTDIR/plugins
cp -Rn web/* $DESTDIR/web
cp -f *.jar $DESTDIR
cp -f *.html $DESTDIR
cp -f *.xml $DESTDIR


