package com.example.spring.boot.service;

import com.example.spring.boot.repository.CarRepository;
import entity.Car;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Optional<Car> getCarById(Long id) {
        return carRepository.findById(id);
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }

    public Car updateCar(Long id, Car updatedCar) {
        Car car = carRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Car not found with id: " + id));

        car.setBrand(updatedCar.getBrand());
        car.setModel(updatedCar.getModel());
        car.setVin(updatedCar.getVin());
        car.setRegistrationNumber(updatedCar.getRegistrationNumber());

        return carRepository.save(car);

    }


}
