package adminlte.ui

class AdminLTEController {

    def show() {
        render view: "/adminlte/${params.page ?: 'index'}"
    }
}
