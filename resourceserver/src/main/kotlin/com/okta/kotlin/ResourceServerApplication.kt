package com.okta.kotlin

import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean


@SpringBootApplication
class ResourceServerApplication  {

	val coffeeShops = listOf(
		CoffeeShopModel(
			name = "Oblique",
			address = "3039 SE Stark St, Portland, OR 97214",
			phone = "555-111-4444",
			priceOfCoffee = 1.50,
			powerAccessible = true,
			internetReliability = 5
		),
		CoffeeShopModel(
			name = "Stumptown Coffee Roasters",
			address = "128 SW 3rd Ave, Portland, OR 97204",
			phone = "555-222-5555",
			priceOfCoffee = 2.00,
			powerAccessible = true,
			internetReliability = 4
		),
		CoffeeShopModel(
			name = "Heart Coffee Roasters",
			address = "2211 E Burnside St, Portland, OR 97214",
			phone = "555-333-6666",
			priceOfCoffee = 2.50,
			powerAccessible = false,
			internetReliability = 5
		),
		CoffeeShopModel(
			name = "Coava Coffee Roasters",
			address = "1300 SE Grand Ave, Portland, OR 97214",
			phone = "555-444-7777",
			priceOfCoffee = 3.00,
			powerAccessible = true,
			internetReliability = 3
		),
		CoffeeShopModel(
			name = "Barista",
			address = "539 NW 13th Ave, Portland, OR 97209",
			phone = "555-555-8888",
			priceOfCoffee = 2.75,
			powerAccessible = true,
			internetReliability = 4
		),
		CoffeeShopModel(
			name = "Upper Left Roasters",
			address = "1204 SE Clay St, Portland, OR 97214",
			phone = "555-666-9999",
			priceOfCoffee = 2.25,
			powerAccessible = true,
			internetReliability = 4
		),
		CoffeeShopModel(
			name = "Ristretto Roasters",
			address = "555 NE Couch St, Portland, OR 97232",
			phone = "555-777-0000",
			priceOfCoffee = 2.50,
			powerAccessible = true,
			internetReliability = 3
		),
		CoffeeShopModel(
			name = "Case Study Coffee Roasters",
			address = "5347 NE Sandy Blvd, Portland, OR 97213",
			phone = "555-888-1111",
			priceOfCoffee = 2.00,
			powerAccessible = false,
			internetReliability = 5
		),
		CoffeeShopModel(
			name = "Cathedral Coffee",
			address = "7530 N Willamette Blvd, Portland, OR 97203",
			phone = "555-999-2222",
			priceOfCoffee = 1.75,
			powerAccessible = true,
			internetReliability = 4
		),
		CoffeeShopModel(
			name = "Never Coffee",
			address = "4243 SE Belmont St, Portland, OR 97215",
			phone = "555-000-3333",
			priceOfCoffee = 2.75,
			powerAccessible = true,
			internetReliability = 5
		),
		CoffeeShopModel(
			name = "Good Coffee",
			address = "4747 SE Division St, Portland, OR 97206",
			phone = "555-111-4444",
			priceOfCoffee = 2.50,
			powerAccessible = true,
			internetReliability = 4
		)
	)

	@Bean
	fun run(repository: CoffeeShopRepository) = ApplicationRunner {
		for (coffeeShop in coffeeShops) {
			repository.save(coffeeShop)
		}
	}

}

fun main(args: Array<String>) {
	runApplication<ResourceServerApplication>(*args)
}
