#!/bin/sh
BASE_PKG=com.github.jasterisk
PROJECT_OUT=../jasterisk
API_PKG="$BASE_PKG.api"
MODEL_PKG="$BASE_PKG.model"
INVOKE_PKG="$BASE_PKG.invoker"
SOURCE_ROOT=$PROJECT_OUT/src/main/java/

rm -r $SOURCE_ROOT${API_PKG//\./\/}
rm -r $SOURCE_ROOT${MODEL_PKG//\./\/}
find $SOURCE_ROOT${INVOKE_PKG//\./\/} -type f -not -name 'Spy.java' -delete
java -jar swagger-codegen-cli.jar generate -i src/main/resources/ASTERISK_15_0/modified/generated.json \
--api-package $API_PKG \
--model-package $MODEL_PKG \
--invoker-package $INVOKE_PKG \
-l java -o $PROJECT_OUT -DdateLibrary=java8 \
--library retrofit2

