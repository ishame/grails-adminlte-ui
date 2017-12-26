package adminlte.ui

class AdminlteUiUrlMappings {

    static mappings = {
        "/adminlte?/$page**"(controller: "AdminLTE", action: "show")
    }
}
