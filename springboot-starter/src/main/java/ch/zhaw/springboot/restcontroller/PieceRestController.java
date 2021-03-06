package ch.zhaw.springboot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.springboot.entities.Piece;
import ch.zhaw.springboot.repositories.PieceRepository;

@RestController
public class PieceRestController {
	@Autowired
	private PieceRepository repository;

	@RequestMapping(value = "piece", method = RequestMethod.GET)
	public ResponseEntity<List<Piece>> getPieces() {
		List<Piece> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Piece>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Piece>>(HttpStatus.NOT_FOUND);
		}
	}
}
