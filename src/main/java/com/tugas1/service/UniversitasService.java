package com.tugas1.service;

import com.tugas1.model.UniversitasModel;

public interface UniversitasService extends DataService<UniversitasModel> {
	UniversitasModel selectUniversitasByName(String name);
}
