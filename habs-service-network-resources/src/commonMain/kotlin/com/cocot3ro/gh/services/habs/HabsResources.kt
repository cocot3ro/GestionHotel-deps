package com.cocot3ro.gh.services.habs

import io.ktor.resources.Resource

@Resource(HabsResources.PATH)
class HabsResources {

    companion object {
        const val PATH = "/api/almacen/habs"
    }

}