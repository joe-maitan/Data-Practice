# import rest API
import pandas as pd
import requests

url = "https://cs-skin-api.p.rapidapi.com/random/AWP"

headers = {
	"X-RapidAPI-Key": "8fbc88775emsh881b0d23ec23a1cp110770jsn2949b3afad08",
	"X-RapidAPI-Host": "cs-skin-api.p.rapidapi.com"
}

response = requests.get(url, headers=headers) # read in the data (JSON format)

print(response.json()) 

my_dataframe = pd.DataFrame(response)
print(my_dataframe)
print("---- Space ----")
print(my_dataframe.info())

# send the data to a SQL database