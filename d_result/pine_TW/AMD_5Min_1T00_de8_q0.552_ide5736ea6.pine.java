//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: AMD_5Min_1T00_e5736ea6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_5Min_1T00_e5736ea6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_5Min_e5736ea6(ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.833997 )
		if( ema2 <= 168.262 )
			if( tema <= 148.133 )
				if( ema2 <= 129 )
					if( tema <= 117.014 )
						if( tema <= 107.613 )
							if( ema3 <= 106.027 )
								if( tema <= 90.0421 )
									ret := -0.680000
								if( tema > 90.0421 )
									ret := 0.500000
							if( ema3 > 106.027 )
								if( ema13 <= -2.77207 )
									ret := -0.500000
								if( ema13 > -2.77207 )
									ret := -0.957447 // sell
						if( tema > 107.613 )
							if( ema1 <= 114.338 )
								if( ema1 <= 113.092 )
									ret := -0.235294
								if( ema1 > 113.092 )
									ret := 0.722222 // buy
							if( ema1 > 114.338 )
								ret := -1.000000 // sell
					if( tema > 117.014 )
						if( tema <= 125.523 )
							if( ema3 <= 123.557 )
								if( tema <= 117.408 )
									ret := 0.882353 // buy
								if( tema > 117.408 )
									ret := -0.285714
							if( ema3 > 123.557 )
								if( ema12 <= -1.00849 )
									ret := 0.983051 // buy
								if( ema12 > -1.00849 )
									ret := 0.625000
						if( tema > 125.523 )
							if( ema1 <= 127.266 )
								ret := -1.000000 // sell
							if( ema1 > 127.266 )
								if( ema2 <= 128.761 )
									ret := 0.500000
								if( ema2 > 128.761 )
									ret := 1.000000 // buy
				if( ema2 > 129 )
					if( ema3 <= 145.135 )
						if( ema3 <= 132.457 )
							if( ema12 <= -1.2702 )
								if( tema <= 126.412 )
									ret := -1.000000 // sell
								if( tema > 126.412 )
									ret := -0.142857
							if( ema12 > -1.2702 )
								ret := -1.000000 // sell
						if( ema3 > 132.457 )
							if( ema1 <= 134.131 )
								if( ema2 <= 134.471 )
									ret := 0.500000
								if( ema2 > 134.471 )
									ret := 1.000000 // buy
							if( ema1 > 134.131 )
								if( ema1 <= 140.419 )
									ret := -0.346154
								if( ema1 > 140.419 )
									ret := -0.716216 // sell
					if( ema3 > 145.135 )
						if( ema2 <= 150.501 )
							if( ema13 <= -2.63546 )
								ret := 1.000000 // buy
							if( ema13 > -2.63546 )
								if( ema3 <= 145.968 )
									ret := 0.642857
								if( ema3 > 145.968 )
									ret := -0.244898
						if( ema2 > 150.501 )
							if( ema12 <= -2.55383 )
								ret := -0.500000
							if( ema12 > -2.55383 )
								ret := -1.000000 // sell
			if( tema > 148.133 )
				if( ema12 <= -1.15532 )
					if( ema12 <= -1.8287 )
						if( tema <= 158.232 )
							if( ema3 <= 158.559 )
								ret := -1.000000 // sell
							if( ema3 > 158.559 )
								if( ema3 <= 160.294 )
									ret := 0.500000
								if( ema3 > 160.294 )
									ret := -1.000000 // sell
						if( tema > 158.232 )
							if( tema <= 161.122 )
								if( ema13 <= -4.08752 )
									ret := 0.750000 // buy
								if( ema13 > -4.08752 )
									ret := 1.000000 // buy
							if( tema > 161.122 )
								ret := -0.285714
					if( ema12 > -1.8287 )
						if( ema1 <= 165.891 )
							if( ema3 <= 164.271 )
								if( tema <= 155.986 )
									ret := 0.821429 // buy
								if( tema > 155.986 )
									ret := -0.666667
							if( ema3 > 164.271 )
								if( tema <= 163.487 )
									ret := 1.000000 // buy
								if( tema > 163.487 )
									ret := 0.625000
						if( ema1 > 165.891 )
							if( ema13 <= -2.68114 )
								if( tema <= 164.46 )
									ret := 1.000000 // buy
								if( tema > 164.46 )
									ret := 0.750000 // buy
							if( ema13 > -2.68114 )
								if( ema3 <= 168.488 )
									ret := -1.000000 // sell
								if( ema3 > 168.488 )
									ret := -0.166667
				if( ema12 > -1.15532 )
					if( ema2 <= 158.302 )
						if( ema13 <= -2.14502 )
							ret := -0.333333
						if( ema13 > -2.14502 )
							if( ema13 <= -1.41344 )
								if( tema <= 150.057 )
									ret := 1.000000 // buy
								if( tema > 150.057 )
									ret := 0.612903
							if( ema13 > -1.41344 )
								ret := 0.000000
					if( ema2 > 158.302 )
						if( ema1 <= 159.49 )
							if( tema <= 157.584 )
								if( ema1 <= 157.439 )
									ret := -0.750000 // sell
								if( ema1 > 157.439 )
									ret := -0.952381 // sell
							if( tema > 157.584 )
								if( ema1 <= 159.035 )
									ret := -0.250000
								if( ema1 > 159.035 )
									ret := -1.000000 // sell
						if( ema1 > 159.49 )
							if( ema3 <= 161.921 )
								if( ema1 <= 160.16 )
									ret := 0.250000
								if( ema1 > 160.16 )
									ret := 1.000000 // buy
							if( ema3 > 161.921 )
								if( tema <= 160.187 )
									ret := -0.785714 // sell
								if( tema > 160.187 )
									ret := 0.065217
		if( ema2 > 168.262 )
			if( tema <= 169.033 )
				if( ema12 <= -1.83165 )
					if( ema13 <= -3.45453 )
						ret := 0.571429
					if( ema13 > -3.45453 )
						ret := -1.000000 // sell
				if( ema12 > -1.83165 )
					if( ema3 <= 169.563 )
						if( ema2 <= 168.645 )
							ret := -1.000000 // sell
						if( ema2 > 168.645 )
							if( tema <= 165.978 )
								ret := 0.800000 // buy
							if( tema > 165.978 )
								ret := -0.500000
					if( ema3 > 169.563 )
						if( ema12 <= -1.48448 )
							if( ema12 <= -1.76106 )
								if( ema12 <= -1.79732 )
									ret := -0.909091 // sell
								if( ema12 > -1.79732 )
									ret := -0.500000
							if( ema12 > -1.76106 )
								ret := -1.000000 // sell
						if( ema12 > -1.48448 )
							if( ema13 <= -2.026 )
								if( ema3 <= 172.253 )
									ret := 0.000000
								if( ema3 > 172.253 )
									ret := -1.000000 // sell
							if( ema13 > -2.026 )
								if( ema2 <= 170.08 )
									ret := -0.705882 // sell
								if( ema2 > 170.08 )
									ret := -1.000000 // sell
			if( tema > 169.033 )
				if( ema3 <= 175.557 )
					if( ema13 <= -2.5222 )
						ret := -1.000000 // sell
					if( ema13 > -2.5222 )
						if( ema1 <= 173.348 )
							if( ema13 <= -1.58975 )
								if( ema2 <= 173.785 )
									ret := 0.500000
								if( ema2 > 173.785 )
									ret := 0.947368 // buy
							if( ema13 > -1.58975 )
								if( ema12 <= -0.885113 )
									ret := -0.454545
								if( ema12 > -0.885113 )
									ret := 0.800000 // buy
						if( ema1 > 173.348 )
							ret := -0.428571
				if( ema3 > 175.557 )
					if( tema <= 173.526 )
						if( tema <= 172.252 )
							if( tema <= 171.483 )
								ret := -1.000000 // sell
							if( tema > 171.483 )
								ret := 0.000000
						if( tema > 172.252 )
							ret := -1.000000 // sell
					if( tema > 173.526 )
						if( ema2 <= 178.452 )
							if( ema1 <= 176.324 )
								if( ema12 <= -1.02574 )
									ret := -0.769231 // sell
								if( ema12 > -1.02574 )
									ret := 0.285714
							if( ema1 > 176.324 )
								if( ema3 <= 178.857 )
									ret := 0.966667 // buy
								if( ema3 > 178.857 )
									ret := 0.266667
						if( ema2 > 178.452 )
							if( ema12 <= -1.14581 )
								if( ema3 <= 202.967 )
									ret := 0.282353
								if( ema3 > 202.967 )
									ret := -0.377778
							if( ema12 > -1.14581 )
								if( ema1 <= 179.291 )
									ret := -0.750000 // sell
								if( ema1 > 179.291 )
									ret := -0.371795
	if( ema12 > -0.833997 )
		if( ema2 <= 96.9127 )
			if( ema13 <= -0.355563 )
				if( tema <= 87.8493 )
					if( ema1 <= 85.5178 )
						if( ema1 <= 83.2448 )
							if( ema12 <= -0.291764 )
								if( ema2 <= 83.0785 )
									ret := 0.000000
								if( ema2 > 83.0785 )
									ret := 1.000000 // buy
							if( ema12 > -0.291764 )
								if( tema <= 81.8671 )
									ret := 1.000000 // buy
								if( tema > 81.8671 )
									ret := 0.863636 // buy
						if( ema1 > 83.2448 )
							if( ema2 <= 84.9234 )
								if( ema1 <= 84.0256 )
									ret := 0.100000
								if( ema1 > 84.0256 )
									ret := -0.666667
							if( ema2 > 84.9234 )
								if( ema13 <= -1.37818 )
									ret := -0.800000 // sell
								if( ema13 > -1.37818 )
									ret := 0.820896 // buy
					if( ema1 > 85.5178 )
						if( ema2 <= 87.0484 )
							if( ema2 <= 86.2329 )
								if( ema3 <= 86.4562 )
									ret := -0.571429
								if( ema3 > 86.4562 )
									ret := 0.500000
							if( ema2 > 86.2329 )
								if( ema13 <= -0.851701 )
									ret := -1.000000 // sell
								if( ema13 > -0.851701 )
									ret := -0.636364
						if( ema2 > 87.0484 )
							if( ema2 <= 87.4312 )
								if( ema12 <= -0.28291 )
									ret := -0.250000
								if( ema12 > -0.28291 )
									ret := 0.733333 // buy
							if( ema2 > 87.4312 )
								if( ema12 <= -0.310186 )
									ret := -0.285714
								if( ema12 > -0.310186 )
									ret := -1.000000 // sell
				if( tema > 87.8493 )
					if( ema12 <= -0.460694 )
						if( ema13 <= -0.75647 )
							ret := 1.000000 // buy
						if( ema13 > -0.75647 )
							ret := 0.750000 // buy
					if( ema12 > -0.460694 )
						if( ema2 <= 94.8109 )
							if( ema1 <= 94.1893 )
								if( ema2 <= 89.2926 )
									ret := 1.000000 // buy
								if( ema2 > 89.2926 )
									ret := 0.156250
							if( ema1 > 94.1893 )
								if( tema <= 94.1029 )
									ret := 0.963636 // buy
								if( tema > 94.1029 )
									ret := 0.400000
						if( ema2 > 94.8109 )
							if( ema2 <= 94.9364 )
								if( ema13 <= -0.480491 )
									ret := 0.500000
								if( ema13 > -0.480491 )
									ret := -1.000000 // sell
							if( ema2 > 94.9364 )
								if( ema13 <= -0.372711 )
									ret := 0.385714
								if( ema13 > -0.372711 )
									ret := 0.944444 // buy
			if( ema13 > -0.355563 )
				if( tema <= 87.9149 )
					if( ema1 <= 87.3833 )
						if( ema12 <= -0.062823 )
							if( ema1 <= 85.5152 )
								if( ema1 <= 82.4864 )
									ret := -0.459016
								if( ema1 > 82.4864 )
									ret := 0.219512
							if( ema1 > 85.5152 )
								if( ema1 <= 86.9276 )
									ret := -0.533981
								if( ema1 > 86.9276 )
									ret := 0.181818
						if( ema12 > -0.062823 )
							if( tema <= 84.8463 )
								if( ema3 <= 84.336 )
									ret := 0.003257
								if( ema3 > 84.336 )
									ret := -0.906250 // sell
							if( tema > 84.8463 )
								if( ema3 <= 85.1004 )
									ret := 0.824561 // buy
								if( ema3 > 85.1004 )
									ret := 0.078998
					if( ema1 > 87.3833 )
						if( ema12 <= 0.263086 )
							if( ema2 <= 87.3509 )
								if( tema <= 87.678 )
									ret := 0.800000 // buy
								if( tema > 87.678 )
									ret := 0.000000
							if( ema2 > 87.3509 )
								if( ema2 <= 87.686 )
									ret := -0.485437
								if( ema2 > 87.686 )
									ret := -0.964286 // sell
						if( ema12 > 0.263086 )
							ret := 0.750000 // buy
				if( tema > 87.9149 )
					if( ema12 <= 0.239527 )
						if( ema1 <= 96.7734 )
							if( ema3 <= 94.4959 )
								if( ema3 <= 93.8314 )
									ret := 0.063005
								if( ema3 > 93.8314 )
									ret := 0.440860
							if( ema3 > 94.4959 )
								if( ema3 <= 94.7556 )
									ret := -0.350877
								if( ema3 > 94.7556 )
									ret := 0.076737
						if( ema1 > 96.7734 )
							if( ema3 <= 96.7979 )
								if( ema3 <= 96.4947 )
									ret := -0.454545
								if( ema3 > 96.4947 )
									ret := 0.140625
							if( ema3 > 96.7979 )
								if( ema2 <= 96.8472 )
									ret := 0.846154 // buy
								if( ema2 > 96.8472 )
									ret := 0.476190
					if( ema12 > 0.239527 )
						if( ema13 <= 1.8674 )
							if( ema1 <= 94.5273 )
								if( ema3 <= 89.5722 )
									ret := 0.446154
								if( ema3 > 89.5722 )
									ret := 0.953846 // buy
							if( ema1 > 94.5273 )
								if( tema <= 95.2303 )
									ret := -0.800000 // sell
								if( tema > 95.2303 )
									ret := 0.389189
						if( ema13 > 1.8674 )
							if( ema12 <= 1.92663 )
								ret := -1.000000 // sell
							if( ema12 > 1.92663 )
								ret := 0.333333
		if( ema2 > 96.9127 )
			if( ema1 <= 100.173 )
				if( ema13 <= 0.204828 )
					if( tema <= 96.6415 )
						if( tema <= 96.4585 )
							if( ema3 <= 97.578 )
								if( ema12 <= -0.35309 )
									ret := -1.000000 // sell
								if( ema12 > -0.35309 )
									ret := -0.500000
							if( ema3 > 97.578 )
								ret := 0.428571
						if( tema > 96.4585 )
							if( ema13 <= -0.583828 )
								if( ema1 <= 97.1773 )
									ret := -0.333333
								if( ema1 > 97.1773 )
									ret := 0.600000
							if( ema13 > -0.583828 )
								if( ema12 <= -0.212746 )
									ret := 1.000000 // buy
								if( ema12 > -0.212746 )
									ret := 0.615385
					if( tema > 96.6415 )
						if( ema13 <= -0.591377 )
							if( tema <= 96.9133 )
								if( ema2 <= 97.7344 )
									ret := -0.750000 // sell
								if( ema2 > 97.7344 )
									ret := 0.750000 // buy
							if( tema > 96.9133 )
								if( ema12 <= -0.368673 )
									ret := -0.666667
								if( ema12 > -0.368673 )
									ret := -0.956522 // sell
						if( ema13 > -0.591377 )
							if( ema12 <= -0.304201 )
								if( ema12 <= -0.374008 )
									ret := -0.500000
								if( ema12 > -0.374008 )
									ret := 0.583333
							if( ema12 > -0.304201 )
								if( ema12 <= -0.24799 )
									ret := -0.666667
								if( ema12 > -0.24799 )
									ret := -0.212054
				if( ema13 > 0.204828 )
					if( ema12 <= 0.113901 )
						if( ema13 <= 0.227786 )
							if( tema <= 98.2282 )
								ret := -0.166667
							if( tema > 98.2282 )
								ret := 0.500000
						if( ema13 > 0.227786 )
							if( ema12 <= 0.097575 )
								if( ema13 <= 0.247057 )
									ret := 0.785714 // buy
								if( ema13 > 0.247057 )
									ret := 0.947368 // buy
							if( ema12 > 0.097575 )
								if( ema12 <= 0.104647 )
									ret := 0.000000
								if( ema12 > 0.104647 )
									ret := 1.000000 // buy
					if( ema12 > 0.113901 )
						if( ema2 <= 97.4887 )
							if( ema1 <= 97.3114 )
								if( ema3 <= 96.8689 )
									ret := -0.900000 // sell
								if( ema3 > 96.8689 )
									ret := -0.050000
							if( ema1 > 97.3114 )
								if( ema2 <= 97.3321 )
									ret := 0.603175
								if( ema2 > 97.3321 )
									ret := 0.166667
						if( ema2 > 97.4887 )
							if( ema1 <= 98.0057 )
								if( ema3 <= 97.3707 )
									ret := -0.545455
								if( ema3 > 97.3707 )
									ret := 0.407407
							if( ema1 > 98.0057 )
								if( ema2 <= 98.2061 )
									ret := -0.695652
								if( ema2 > 98.2061 )
									ret := 0.037037
			if( ema1 > 100.173 )
				if( ema2 <= 102.156 )
					if( ema13 <= 0.998097 )
						if( ema3 <= 101.96 )
							if( ema3 <= 101.619 )
								if( ema13 <= 0.210673 )
									ret := 0.136247
								if( ema13 > 0.210673 )
									ret := 0.430000
							if( ema3 > 101.619 )
								if( ema13 <= -0.447792 )
									ret := 0.418605
								if( ema13 > -0.447792 )
									ret := -0.098143
						if( ema3 > 101.96 )
							if( ema12 <= -0.032304 )
								if( ema1 <= 101.911 )
									ret := 0.477273
								if( ema1 > 101.911 )
									ret := -0.088889
							if( ema12 > -0.032304 )
								if( ema12 <= 0.131286 )
									ret := 0.608974
								if( ema12 > 0.131286 )
									ret := -0.266667
					if( ema13 > 0.998097 )
						if( tema <= 102.281 )
							if( ema12 <= 0.514109 )
								ret := 1.000000 // buy
							if( ema12 > 0.514109 )
								if( ema1 <= 100.872 )
									ret := 0.809524 // buy
								if( ema1 > 100.872 )
									ret := 0.000000
						if( tema > 102.281 )
							if( ema3 <= 101.345 )
								ret := 1.000000 // buy
							if( ema3 > 101.345 )
								ret := 0.750000 // buy
				if( ema2 > 102.156 )
					if( ema13 <= -0.379163 )
						if( ema2 <= 193.239 )
							if( ema3 <= 179.311 )
								if( ema2 <= 173.593 )
									ret := 0.083974
								if( ema2 > 173.593 )
									ret := 0.296820
							if( ema3 > 179.311 )
								if( ema3 <= 180.097 )
									ret := -0.533898
								if( ema3 > 180.097 )
									ret := -0.096644
						if( ema2 > 193.239 )
							if( ema3 <= 211.184 )
								if( ema1 <= 208.645 )
									ret := 0.335013
								if( ema1 > 208.645 )
									ret := 0.783019 // buy
							if( ema3 > 211.184 )
								if( ema3 <= 211.628 )
									ret := -0.846154 // sell
								if( ema3 > 211.628 )
									ret := 0.000000
					if( ema13 > -0.379163 )
						if( tema <= 103.305 )
							if( ema12 <= 0.252619 )
								if( ema1 <= 102.579 )
									ret := 0.019934
								if( ema1 > 102.579 )
									ret := -0.215247
							if( ema12 > 0.252619 )
								if( ema3 <= 102.266 )
									ret := -0.882353 // sell
								if( ema3 > 102.266 )
									ret := 0.200000
						if( tema > 103.305 )
							if( ema12 <= -0.190793 )
								if( ema3 <= 122.444 )
									ret := -0.354839
								if( ema3 > 122.444 )
									ret := -0.009352
							if( ema12 > -0.190793 )
								if( ema2 <= 167.375 )
									ret := 0.054303
								if( ema2 > 167.375 )
									ret := 0.009798
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_AMD_5Min_e5736ea6(ema3, tema, ema2, ema12, ema13, ema1)

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


