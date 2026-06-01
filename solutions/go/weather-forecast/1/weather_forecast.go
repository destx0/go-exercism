// Package weather forecasts the current weather condition of cities.
package weather

// CurrentCondition stores the current weather condition of the city.
var CurrentCondition string

// CurrentLocation stores the current location of the city being forecasted.
var CurrentLocation string

// Forecast return weather forecast of city.
func Forecast(city, condition string) string {
	CurrentLocation, CurrentCondition = city, condition
	return CurrentLocation + " - current weather condition: " + CurrentCondition
}
