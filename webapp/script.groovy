def buildApp() {
    echo 'building the application...'
    echo "building version ${NEW_VERSION}"
        
}
def testApp() {
    echo 'building the application...'

}

def deployApp() {
    echo 'building the application...'
    echo " deploying version: ${params.VERSION}"

}
return this