SERVER=login.mathematik.uni-marburg.de
DIR=public_html/projects/sugarj

rsync -av --exclude=".git" --exclude="*~" . $SERVER:$DIR