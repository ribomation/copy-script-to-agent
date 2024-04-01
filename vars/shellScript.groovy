def call(Map params = [:]) {
    def name = params.name ?: 'greeting'
    def args = params.args ?: ''
    def file = "${name}.sh"
    def text = libraryResource "ribomation/linux/${file}"

    writeFile file: file, text: text
    sh "chmod a+x ./${file}"
    echo "copied script ${name} into agent workspace as './${file}'"

    sh "./${file} ${args}"
}
