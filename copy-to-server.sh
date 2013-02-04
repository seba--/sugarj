SERVER=xx00seba@clientssh2.rbg.informatik.tu-darmstadt.de
DIR=.public_html/projects/sugarj

rsync -av --exclude=".svn" --exclude=".git" --exclude="*~" --exclude="*.sh" --exclude=".DS_Store" . $SERVER:$DIR
