docker run --rm \
    -v $PWD/Projects/idea/esa-client/src/main/resources:/local openapitools/openapi-generator-cli generate \
    -i /local/e-sign_anywhere_api_fi-V4.0-resolved.yaml \
    -g java \
    -p java8=true \
    --library webclient \
    -o /local/out/java8