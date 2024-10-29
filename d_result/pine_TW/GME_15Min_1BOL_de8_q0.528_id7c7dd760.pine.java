//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: GME_15Min_1BOL_7c7dd760 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GME_15Min_1BOL_7c7dd760", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GME_15Min_7c7dd760(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( vrsi <= 62.6625 )
		if( BBlower <= 12.8677 )
			if( vrsi <= 52.0791 )
				if( dif_source_BBupper <= -0.107453 )
					if( BBupper <= 4.81984 )
						if( BBupper <= 3.92587 )
							if( BBupper <= 3.56113 )
								if( BBlower <= 2.63959 )
									ret := -0.200000
								if( BBlower > 2.63959 )
									ret := 0.800000 // buy
							if( BBupper > 3.56113 )
								if( BBlower <= 3.2696 )
									ret := 0.621622
								if( BBlower > 3.2696 )
									ret := 0.843750 // buy
						if( BBupper > 3.92587 )
							if( dif_source_BBupper <= -0.338037 )
								if( dif_source_BBlower <= 0.499292 )
									ret := 0.302000
								if( dif_source_BBlower > 0.499292 )
									ret := 0.728814 // buy
							if( dif_source_BBupper > -0.338037 )
								if( BBupper <= 4.60219 )
									ret := 0.121409
								if( BBupper > 4.60219 )
									ret := 0.329268
					if( BBupper > 4.81984 )
						if( BBupper <= 12.4936 )
							if( dif_source_BBlower <= -0.126683 )
								if( BBlower <= 6.83959 )
									ret := 0.063218
								if( BBlower > 6.83959 )
									ret := -0.333333
							if( dif_source_BBlower > -0.126683 )
								if( dif_source_BBlower <= 3.2591 )
									ret := 0.114503
								if( dif_source_BBlower > 3.2591 )
									ret := -0.700000 // sell
						if( BBupper > 12.4936 )
							if( BBupper <= 13.0502 )
								if( BBlower <= 11.0864 )
									ret := 0.354430
								if( BBlower > 11.0864 )
									ret := 0.656489
							if( BBupper > 13.0502 )
								if( BBupper <= 17.7689 )
									ret := 0.226721
								if( BBupper > 17.7689 )
									ret := 0.077393
				if( dif_source_BBupper > -0.107453 )
					if( BBlower <= -21.2901 )
						if( vrsi <= 43.4583 )
							if( dif_source_BBlower <= 312.513 )
								ret := -1.000000 // sell
							if( dif_source_BBlower > 312.513 )
								if( vrsi <= 40.5039 )
									ret := 1.000000 // buy
								if( vrsi > 40.5039 )
									ret := 0.000000
						if( vrsi > 43.4583 )
							if( dif_source_BBlower <= 365.776 )
								ret := -0.750000 // sell
							if( dif_source_BBlower > 365.776 )
								ret := -1.000000 // sell
					if( BBlower > -21.2901 )
						if( dif_source_BBlower <= 72.5779 )
							if( BBlower <= 1.47495 )
								ret := -1.000000 // sell
							if( BBlower > 1.47495 )
								if( dif_source_BBlower <= 25.7253 )
									ret := 0.284431
								if( dif_source_BBlower > 25.7253 )
									ret := -0.714286 // sell
						if( dif_source_BBlower > 72.5779 )
							if( dif_source_BBupper <= 19.4116 )
								if( dif_source_BBlower <= 167.387 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > 167.387 )
									ret := 0.750000 // buy
							if( dif_source_BBupper > 19.4116 )
								if( dif_source_BBupper <= 31.2155 )
									ret := -0.500000
								if( dif_source_BBupper > 31.2155 )
									ret := 1.000000 // buy
			if( vrsi > 52.0791 )
				if( dif_source_BBupper <= -0.821536 )
					if( BBupper <= 14.7271 )
						if( BBupper <= 6.00283 )
							if( BBlower <= 5.01864 )
								if( BBupper <= 5.16935 )
									ret := -0.142857
								if( BBupper > 5.16935 )
									ret := 0.137500
							if( BBlower > 5.01864 )
								ret := -1.000000 // sell
						if( BBupper > 6.00283 )
							if( dif_source_BBupper <= -2.0025 )
								if( BBlower <= 5.71618 )
									ret := 0.437500
								if( BBlower > 5.71618 )
									ret := -0.319149
							if( dif_source_BBupper > -2.0025 )
								if( vrsi <= 60.7664 )
									ret := 0.379182
								if( vrsi > 60.7664 )
									ret := 0.091743
					if( BBupper > 14.7271 )
						if( dif_source_BBupper <= -289.001 )
							ret := 1.000000 // buy
						if( dif_source_BBupper > -289.001 )
							if( BBlower <= -11.2599 )
								if( BBupper <= 411.941 )
									ret := 0.648649
								if( BBupper > 411.941 )
									ret := -1.000000 // sell
							if( BBlower > -11.2599 )
								if( dif_source_BBlower <= 66.6603 )
									ret := -0.008065
								if( dif_source_BBlower > 66.6603 )
									ret := -0.794118 // sell
				if( dif_source_BBupper > -0.821536 )
					if( BBupper <= 3.84141 )
						if( vrsi <= 54.1262 )
							if( BBlower <= 2.60443 )
								if( vrsi <= 53.076 )
									ret := 1.000000 // buy
								if( vrsi > 53.076 )
									ret := -1.000000 // sell
							if( BBlower > 2.60443 )
								if( dif_source_BBlower <= 0.688196 )
									ret := 0.900000 // buy
								if( dif_source_BBlower > 0.688196 )
									ret := 0.250000
						if( vrsi > 54.1262 )
							if( BBupper <= 3.58844 )
								if( BBupper <= 3.54314 )
									ret := 0.888889 // buy
								if( BBupper > 3.54314 )
									ret := -0.166667
							if( BBupper > 3.58844 )
								if( BBlower <= 3.0686 )
									ret := 1.000000 // buy
								if( BBlower > 3.0686 )
									ret := 0.692308
					if( BBupper > 3.84141 )
						if( BBlower <= -33.9797 )
							if( BBlower <= -41.3216 )
								ret := -0.750000 // sell
							if( BBlower > -41.3216 )
								ret := -1.000000 // sell
						if( BBlower > -33.9797 )
							if( dif_source_BBlower <= 0.891082 )
								if( BBlower <= 3.94449 )
									ret := 0.070588
								if( BBlower > 3.94449 )
									ret := -0.127185
							if( dif_source_BBlower > 0.891082 )
								if( vrsi <= 60.1296 )
									ret := -0.011070
								if( vrsi > 60.1296 )
									ret := 0.256098
		if( BBlower > 12.8677 )
			if( dif_source_BBlower <= 48.6549 )
				if( BBlower <= 252.467 )
					if( dif_source_BBupper <= -133.023 )
						if( BBupper <= 219.849 )
							if( dif_source_BBlower <= -51.8768 )
								ret := 0.000000
							if( dif_source_BBlower > -51.8768 )
								if( dif_source_BBlower <= -4.26356 )
									ret := -0.961538 // sell
								if( dif_source_BBlower > -4.26356 )
									ret := -0.809524 // sell
						if( BBupper > 219.849 )
							if( BBlower <= 71.9419 )
								if( BBlower <= 31.2565 )
									ret := 0.000000
								if( BBlower > 31.2565 )
									ret := 0.645161
							if( BBlower > 71.9419 )
								if( dif_source_BBlower <= -0.501242 )
									ret := 0.812500 // buy
								if( dif_source_BBlower > -0.501242 )
									ret := -0.484127
					if( dif_source_BBupper > -133.023 )
						if( BBupper <= 342.44 )
							if( dif_source_BBupper <= -101.972 )
								if( dif_source_BBupper <= -130.306 )
									ret := 0.200000
								if( dif_source_BBupper > -130.306 )
									ret := 0.874074 // buy
							if( dif_source_BBupper > -101.972 )
								if( dif_source_BBupper <= -30.0734 )
									ret := 0.144788
								if( dif_source_BBupper > -30.0734 )
									ret := 0.041657
						if( BBupper > 342.44 )
							if( BBlower <= 209.782 )
								ret := -0.500000
							if( BBlower > 209.782 )
								if( dif_source_BBlower <= 16.3311 )
									ret := -0.857143 // sell
								if( dif_source_BBlower > 16.3311 )
									ret := -1.000000 // sell
				if( BBlower > 252.467 )
					if( BBlower <= 255.26 )
						if( BBupper <= 326.342 )
							ret := -0.166667
						if( BBupper > 326.342 )
							ret := -1.000000 // sell
					if( BBlower > 255.26 )
						if( vrsi <= 2.93718 )
							ret := -0.600000
						if( vrsi > 2.93718 )
							ret := -1.000000 // sell
			if( dif_source_BBlower > 48.6549 )
				if( vrsi <= 30.7277 )
					if( dif_source_BBlower <= 60.3281 )
						if( dif_source_BBupper <= -1.3526 )
							if( BBlower <= 72.9881 )
								if( BBupper <= 248.73 )
									ret := -1.000000 // sell
								if( BBupper > 248.73 )
									ret := -0.500000
							if( BBlower > 72.9881 )
								if( BBupper <= 274.458 )
									ret := 0.516667
								if( BBupper > 274.458 )
									ret := -0.277778
						if( dif_source_BBupper > -1.3526 )
							if( vrsi <= 16.1309 )
								ret := -0.285714
							if( vrsi > 16.1309 )
								ret := -1.000000 // sell
					if( dif_source_BBlower > 60.3281 )
						if( dif_source_BBlower <= 151.131 )
							if( dif_source_BBlower <= 126.542 )
								if( BBupper <= 145.634 )
									ret := 0.906977 // buy
								if( BBupper > 145.634 )
									ret := 0.555985
							if( dif_source_BBlower > 126.542 )
								if( BBupper <= 443.569 )
									ret := -0.739130 // sell
								if( BBupper > 443.569 )
									ret := 1.000000 // buy
						if( dif_source_BBlower > 151.131 )
							if( vrsi <= 13.9923 )
								ret := 0.400000
							if( vrsi > 13.9923 )
								ret := 1.000000 // buy
				if( vrsi > 30.7277 )
					if( dif_source_BBlower <= 67.4144 )
						if( BBlower <= 113.562 )
							if( BBupper <= 175.349 )
								if( BBupper <= 152.232 )
									ret := 0.743119 // buy
								if( BBupper > 152.232 )
									ret := -0.400000
							if( BBupper > 175.349 )
								if( BBlower <= 33.3051 )
									ret := -0.500000
								if( BBlower > 33.3051 )
									ret := 0.985915 // buy
						if( BBlower > 113.562 )
							if( BBupper <= 382.097 )
								if( BBlower <= 218.53 )
									ret := 0.106145
								if( BBlower > 218.53 )
									ret := 0.722222 // buy
							if( BBupper > 382.097 )
								ret := -1.000000 // sell
					if( dif_source_BBlower > 67.4144 )
						if( BBlower <= 177.012 )
							if( BBlower <= 131.879 )
								if( BBlower <= 113.354 )
									ret := -0.038997
								if( BBlower > 113.354 )
									ret := -0.551724
							if( BBlower > 131.879 )
								if( dif_source_BBlower <= 85.3153 )
									ret := 0.750000 // buy
								if( dif_source_BBlower > 85.3153 )
									ret := 0.122807
						if( BBlower > 177.012 )
							if( dif_source_BBlower <= 80.0719 )
								if( BBlower <= 223.228 )
									ret := -0.800000 // sell
								if( BBlower > 223.228 )
									ret := 0.433333
							if( dif_source_BBlower > 80.0719 )
								if( dif_source_BBlower <= 81.5673 )
									ret := -0.750000 // sell
								if( dif_source_BBlower > 81.5673 )
									ret := -1.000000 // sell
	if( vrsi > 62.6625 )
		if( dif_source_BBupper <= 1.14301 )
			if( BBlower <= 3.26847 )
				if( vrsi <= 80.0025 )
					if( BBlower <= -36.6717 )
						ret := -1.000000 // sell
					if( BBlower > -36.6717 )
						if( BBupper <= 170.741 )
							if( BBlower <= 2.56381 )
								if( dif_source_BBupper <= 0.257113 )
									ret := 0.807692 // buy
								if( dif_source_BBupper > 0.257113 )
									ret := -1.000000 // sell
							if( BBlower > 2.56381 )
								if( BBupper <= 5.00087 )
									ret := 0.465686
								if( BBupper > 5.00087 )
									ret := -0.714286 // sell
						if( BBupper > 170.741 )
							if( BBlower <= -11.6735 )
								if( BBlower <= -27.099 )
									ret := 0.750000 // buy
								if( BBlower > -27.099 )
									ret := -0.733333 // sell
							if( BBlower > -11.6735 )
								if( dif_source_BBlower <= 107.382 )
									ret := -0.166667
								if( dif_source_BBlower > 107.382 )
									ret := 0.625000
				if( vrsi > 80.0025 )
					if( dif_source_BBlower <= 324.706 )
						if( dif_source_BBupper <= 0.316231 )
							if( BBlower <= 1.10753 )
								if( BBupper <= 159.034 )
									ret := -0.200000
								if( BBupper > 159.034 )
									ret := -0.956522 // sell
							if( BBlower > 1.10753 )
								if( BBlower <= 3.12879 )
									ret := 0.145161
								if( BBlower > 3.12879 )
									ret := -0.282609
						if( dif_source_BBupper > 0.316231 )
							ret := -1.000000 // sell
					if( dif_source_BBlower > 324.706 )
						ret := 1.000000 // buy
			if( BBlower > 3.26847 )
				if( BBupper <= 5.32729 )
					if( BBupper <= 4.8723 )
						if( dif_source_BBlower <= 0.221362 )
							if( BBupper <= 4.84882 )
								if( dif_source_BBupper <= -0.790652 )
									ret := 0.950000 // buy
								if( dif_source_BBupper > -0.790652 )
									ret := 0.085981
							if( BBupper > 4.84882 )
								if( vrsi <= 75.3668 )
									ret := 0.928571 // buy
								if( vrsi > 75.3668 )
									ret := 0.000000
						if( dif_source_BBlower > 0.221362 )
							if( dif_source_BBlower <= 0.498413 )
								if( BBlower <= 4.1064 )
									ret := -0.182344
								if( BBlower > 4.1064 )
									ret := 0.258621
							if( dif_source_BBlower > 0.498413 )
								if( vrsi <= 97.256 )
									ret := -0.227360
								if( vrsi > 97.256 )
									ret := -0.696429
					if( BBupper > 4.8723 )
						if( vrsi <= 64.7525 )
							if( BBlower <= 3.97384 )
								if( BBlower <= 3.80562 )
									ret := -0.833333 // sell
								if( BBlower > 3.80562 )
									ret := -0.250000
							if( BBlower > 3.97384 )
								if( vrsi <= 63.9467 )
									ret := 0.666667
								if( vrsi > 63.9467 )
									ret := 0.055556
						if( vrsi > 64.7525 )
							if( dif_source_BBupper <= -0.095997 )
								if( vrsi <= 77.0566 )
									ret := -0.535135
								if( vrsi > 77.0566 )
									ret := -0.225610
							if( dif_source_BBupper > -0.095997 )
								if( BBlower <= 4.56379 )
									ret := -0.789916 // sell
								if( BBlower > 4.56379 )
									ret := 0.000000
				if( BBupper > 5.32729 )
					if( BBupper <= 186.643 )
						if( vrsi <= 71.7325 )
							if( BBlower <= 117.767 )
								if( BBlower <= 112.65 )
									ret := 0.011044
								if( BBlower > 112.65 )
									ret := -0.235955
							if( BBlower > 117.767 )
								if( dif_source_BBupper <= -10.4759 )
									ret := 0.086420
								if( dif_source_BBupper > -10.4759 )
									ret := 0.347722
						if( vrsi > 71.7325 )
							if( dif_source_BBlower <= 57.8001 )
								if( BBlower <= 5.25709 )
									ret := 0.159642
								if( BBlower > 5.25709 )
									ret := -0.051856
							if( dif_source_BBlower > 57.8001 )
								if( BBlower <= 13.9668 )
									ret := 0.974359 // buy
								if( BBlower > 13.9668 )
									ret := 0.061728
					if( BBupper > 186.643 )
						if( dif_source_BBlower <= 160.741 )
							if( BBlower <= 196.94 )
								if( dif_source_BBupper <= -16.2684 )
									ret := -0.100739
								if( dif_source_BBupper > -16.2684 )
									ret := -0.390645
							if( BBlower > 196.94 )
								if( dif_source_BBlower <= 66.6335 )
									ret := 0.130779
								if( dif_source_BBlower > 66.6335 )
									ret := -0.823529 // sell
						if( dif_source_BBlower > 160.741 )
							if( dif_source_BBlower <= 301.239 )
								if( BBlower <= 97.3305 )
									ret := 0.811765 // buy
								if( BBlower > 97.3305 )
									ret := -0.347826
							if( dif_source_BBlower > 301.239 )
								if( BBupper <= 461.58 )
									ret := 0.000000
								if( BBupper > 461.58 )
									ret := -1.000000 // sell
		if( dif_source_BBupper > 1.14301 )
			if( BBupper <= 195.481 )
				if( dif_source_BBlower <= 215.734 )
					if( BBlower <= 4.52687 )
						if( vrsi <= 68.6399 )
							if( BBupper <= 129.762 )
								ret := -0.500000
							if( BBupper > 129.762 )
								ret := 1.000000 // buy
						if( vrsi > 68.6399 )
							if( vrsi <= 77.3603 )
								if( dif_source_BBlower <= 167.81 )
									ret := -0.200000
								if( dif_source_BBlower > 167.81 )
									ret := -1.000000 // sell
							if( vrsi > 77.3603 )
								ret := -1.000000 // sell
					if( BBlower > 4.52687 )
						if( BBlower <= 9.4304 )
							if( BBlower <= 8.11968 )
								if( dif_source_BBlower <= 20.5471 )
									ret := -0.692308
								if( dif_source_BBlower > 20.5471 )
									ret := 0.714286 // buy
							if( BBlower > 8.11968 )
								if( vrsi <= 83.7084 )
									ret := 0.976744 // buy
								if( vrsi > 83.7084 )
									ret := 0.625000
						if( BBlower > 9.4304 )
							if( dif_source_BBlower <= 32.3456 )
								if( dif_source_BBlower <= 26.1517 )
									ret := 0.159292
								if( dif_source_BBlower > 26.1517 )
									ret := -0.194969
							if( dif_source_BBlower > 32.3456 )
								if( dif_source_BBupper <= 68.8957 )
									ret := 0.371298
								if( dif_source_BBupper > 68.8957 )
									ret := -1.000000 // sell
				if( dif_source_BBlower > 215.734 )
					ret := 1.000000 // buy
			if( BBupper > 195.481 )
				if( dif_source_BBlower <= 91.379 )
					if( dif_source_BBupper <= 12.0419 )
						if( BBupper <= 215.338 )
							if( vrsi <= 70.5892 )
								if( BBlower <= 163.269 )
									ret := 0.888889 // buy
								if( BBlower > 163.269 )
									ret := 0.250000
							if( vrsi > 70.5892 )
								if( dif_source_BBupper <= 3.0798 )
									ret := -0.900000 // sell
								if( dif_source_BBupper > 3.0798 )
									ret := -0.592593
						if( BBupper > 215.338 )
							if( dif_source_BBlower <= 58.0578 )
								if( dif_source_BBlower <= 21.4193 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > 21.4193 )
									ret := -0.071429
							if( dif_source_BBlower > 58.0578 )
								if( BBlower <= 164.159 )
									ret := 0.928571 // buy
								if( BBlower > 164.159 )
									ret := 0.250000
					if( dif_source_BBupper > 12.0419 )
						if( dif_source_BBlower <= 75.1687 )
							ret := -1.000000 // sell
						if( dif_source_BBlower > 75.1687 )
							ret := -0.200000
				if( dif_source_BBlower > 91.379 )
					if( dif_source_BBlower <= 413.092 )
						if( dif_source_BBupper <= 7.7299 )
							ret := -0.400000
						if( dif_source_BBupper > 7.7299 )
							if( dif_source_BBupper <= 14.6484 )
								if( dif_source_BBlower <= 281.103 )
									ret := -0.750000 // sell
								if( dif_source_BBlower > 281.103 )
									ret := -1.000000 // sell
							if( dif_source_BBupper > 14.6484 )
								ret := -1.000000 // sell
					if( dif_source_BBlower > 413.092 )
						if( dif_source_BBlower <= 484.635 )
							ret := 1.000000 // buy
						if( dif_source_BBlower > 484.635 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Bollinger_RSI_Double_Strategy 
//@version=5
//strategy "Bollinger + RSI, Double Strategy (by ChartArt) v1.1", shorttitle="CA_-_RSI_Bol_Strat_1.1", overlay=true)

// ChartArt's RSI + Bollinger Bands, Double Strategy - Update
//
// Version 1.1
// Idea by ChartArt on January 18, 2015.
//
// This strategy uses the RSI indicator
// together with the Bollinger Bands
// to sell when the price is above the
// upper Bollinger Band (and to buy when
// this value is below the lower band).
//
// This simple strategy only triggers when
// both the RSI and the Bollinger Bands
// indicators are at the same time in
// a overbought or oversold condition.
//
// In this version 1.1 the strategy was
// both simplified for the user and
// made more successful in backtesting.
//
// List of my work:
// https://www.tradingview.com/u/ChartArt/
//
//  __             __  ___       __  ___
// /  ` |__|  /\  |__)  |   /\  |__)  |
// \__, |  | /~~\ |  \  |  /~~\ |  \  |
//
//

///////////// RSI
RSIlength = input.int(6, title="RSI Period Length")
RSIoverSold = 50
RSIoverBought = 50
price = close
vrsi = ta.rsi(price, RSIlength)

///////////// Bollinger Bands
BBlength = input.int(200, minval=1, title="Bollinger Period Length")
BBmult = 2 // input(2.0, minval=0.001, maxval=50,title="Bollinger Bands Standard Deviation")
BBbasis = ta.sma(price, BBlength)
BBdev = BBmult * ta.stdev(price, BBlength)
BBupper = BBbasis + BBdev
BBlower = BBbasis - BBdev
source = close
buyEntry = ta.crossover(source, BBlower)
sellEntry = ta.crossunder(source, BBupper)
plot(BBbasis, color=color.aqua, title="Bollinger Bands SMA Basis Line")
p1 = plot(BBupper, color=color.silver, title="Bollinger Bands Upper Line")
p2 = plot(BBlower, color=color.silver, title="Bollinger Bands Lower Line")
fill(p1, p2)

///////////// Colors
switch1 = input(true, title="Enable Bar Color?")
switch2 = input(true, title="Enable Background Color?")
TrendColor = (price[1] > BBupper and price < BBupper and BBbasis < BBbasis[1]) ? color.red : (price[1] < BBlower and price > BBlower and BBbasis > BBbasis[1]) ? color.green : na
// bgColor1 = color.new(TrendColor, 70)
barcolor(switch1 ? TrendColor : na)

// Using color.new() to set transparency
bgColor = color.new(TrendColor, 90)
bgcolor(switch2 ? bgColor : na)

///////////// RSI + Bollinger Bands Strategy
crossover_rsi_bblower = ta.crossover(vrsi, RSIoverSold) and ta.crossover(source, BBlower)
crossunder_rsi_bbupper = ta.crossunder(vrsi, RSIoverBought) and ta.crossunder(source, BBupper)

crossover_rsi_bblowerInt = crossover_rsi_bblower ? 1: 0    //Bool to int
crossunder_rsi_bbupperInt = crossunder_rsi_bbupper ? 1: 0  //Bool to int

dif_vrsi_RSIoverSold = vrsi - RSIoverSold
dif_source_BBlower = source - BBlower
dif_vrsi_RSIoverBought = vrsi - RSIoverBought
dif_source_BBupper = source - BBupper

// if not na(vrsi)
//     if crossover_rsi_bblower
//         strategy.entry("RSI_BB_L", strategy.long, stop=BBlower, oca_type=strategy.oca.cancel, comment="RSI_BB_L")
//     else
//         strategy.cancel(id="RSI_BB_L")
//
//     if crossunder_rsi_bbupper
//         strategy.entry("RSI_BB_S", strategy.short, stop=BBupper, oca_type=strategy.oca.cancel, comment="RSI_BB_S")
//     else
//         strategy.cancel(id="RSI_BB_S")

//plot(strategy.equity, title="equity", color=color.red, linewidth=2, style=plot.style_areabr)
// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_GME_15Min_7c7dd760(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


