//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: MSFT_30Min_2BT0_a1f86e22 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_30Min_2BT0_a1f86e22", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_30Min_a1f86e22(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema2 <= 51.2714 )
		if( bbm <= 0.20005 )
			if( bearPower <= -0.189194 )
				if( ema12 <= -0.142806 )
					if( ema1 <= 50.3659 )
						if( bearPower <= -0.335956 )
							if( ema1 <= 49.4275 )
								if( ema12 <= -0.267749 )
									ret := -0.250000
								if( ema12 > -0.267749 )
									ret := -1.000000 // sell
							if( ema1 > 49.4275 )
								if( bbp <= -0.609195 )
									ret := -0.105263
								if( bbp > -0.609195 )
									ret := 0.800000 // buy
						if( bearPower > -0.335956 )
							if( bbm <= 0.116984 )
								ret := -1.000000 // sell
							if( bbm > 0.116984 )
								if( ema3 <= 50.2647 )
									ret := -0.944444 // sell
								if( ema3 > 50.2647 )
									ret := -0.333333
					if( ema1 > 50.3659 )
						if( ema3 <= 50.8793 )
							ret := 0.750000 // buy
						if( ema3 > 50.8793 )
							if( ema3 <= 51.3445 )
								ret := 0.000000
							if( ema3 > 51.3445 )
								ret := -0.750000 // sell
				if( ema12 > -0.142806 )
					if( ema2 <= 50.9469 )
						if( ema13 <= -0.222715 )
							if( bbm <= 0.116021 )
								ret := -0.166667
							if( bbm > 0.116021 )
								ret := -1.000000 // sell
						if( ema13 > -0.222715 )
							if( ema2 <= 50.5955 )
								if( ema2 <= 49.8681 )
									ret := -0.500000
								if( ema2 > 49.8681 )
									ret := 0.448276
							if( ema2 > 50.5955 )
								if( ema3 <= 50.7647 )
									ret := -0.818182 // sell
								if( ema3 > 50.7647 )
									ret := 0.000000
					if( ema2 > 50.9469 )
						if( ema2 <= 51.0875 )
							ret := 1.000000 // buy
						if( ema2 > 51.0875 )
							ret := 0.142857
			if( bearPower > -0.189194 )
				if( ema2 <= 50.3531 )
					if( ema1 <= 50.0653 )
						if( ema2 <= 49.8732 )
							if( bbm <= 0.004152 )
								if( ema1 <= 49.3112 )
									ret := -0.666667
								if( ema1 > 49.3112 )
									ret := 0.166667
							if( bbm > 0.004152 )
								if( bearPower <= 0.132188 )
									ret := 0.721154 // buy
								if( bearPower > 0.132188 )
									ret := 0.250000
						if( ema2 > 49.8732 )
							if( ema3 <= 49.8702 )
								if( ema13 <= 0.086538 )
									ret := 0.000000
								if( ema13 > 0.086538 )
									ret := 0.500000
							if( ema3 > 49.8702 )
								if( bullPower <= 0.143672 )
									ret := -0.254902
								if( bullPower > 0.143672 )
									ret := -0.923077 // sell
					if( ema1 > 50.0653 )
						if( ema13 <= 0.243921 )
							if( bearPower <= -0.113177 )
								if( ema2 <= 50.2111 )
									ret := 0.428571
								if( ema2 > 50.2111 )
									ret := 0.000000
							if( bearPower > -0.113177 )
								if( ema2 <= 50.2515 )
									ret := 0.654321
								if( ema2 > 50.2515 )
									ret := 0.941176 // buy
						if( ema13 > 0.243921 )
							if( ema1 <= 50.1695 )
								ret := 0.250000
							if( ema1 > 50.1695 )
								if( ema2 <= 50.2803 )
									ret := 0.000000
								if( ema2 > 50.2803 )
									ret := 0.250000
				if( ema2 > 50.3531 )
					if( ema2 <= 50.7901 )
						if( ema12 <= -0.088222 )
							if( bullPower <= -0.073306 )
								ret := 0.200000
							if( bullPower > -0.073306 )
								ret := 1.000000 // buy
						if( ema12 > -0.088222 )
							if( bbm <= 0.10005 )
								if( bbp <= -0.252939 )
									ret := 0.250000
								if( bbp > -0.252939 )
									ret := -0.805970 // sell
							if( bbm > 0.10005 )
								if( bbp <= -0.113338 )
									ret := -0.904762 // sell
								if( bbp > -0.113338 )
									ret := -0.013889
					if( ema2 > 50.7901 )
						if( bbm <= 0.010388 )
							if( tema <= 51.2392 )
								if( ema1 <= 51.0668 )
									ret := 0.333333
								if( ema1 > 51.0668 )
									ret := -0.076923
							if( tema > 51.2392 )
								if( ema12 <= 0.097285 )
									ret := -0.916667 // sell
								if( ema12 > 0.097285 )
									ret := 0.250000
						if( bbm > 0.010388 )
							if( tema <= 51.0817 )
								if( ema13 <= -0.200622 )
									ret := 0.965517 // buy
								if( ema13 > -0.200622 )
									ret := 0.687500
							if( tema > 51.0817 )
								if( bbp <= -0.119941 )
									ret := -1.000000 // sell
								if( bbp > -0.119941 )
									ret := 0.379310
		if( bbm > 0.20005 )
			if( ema12 <= 0.092321 )
				if( ema13 <= -0.295519 )
					if( bearPower <= -0.463769 )
						if( bbm <= 0.31297 )
							if( ema13 <= -0.384345 )
								if( bearPower <= -0.511644 )
									ret := 0.588235
								if( bearPower > -0.511644 )
									ret := -0.142857
							if( ema13 > -0.384345 )
								ret := -0.750000 // sell
						if( bbm > 0.31297 )
							if( ema1 <= 50.3945 )
								if( ema12 <= -0.27461 )
									ret := 0.705882 // buy
								if( ema12 > -0.27461 )
									ret := 1.000000 // buy
							if( ema1 > 50.3945 )
								if( ema2 <= 50.8817 )
									ret := -0.400000
								if( ema2 > 50.8817 )
									ret := 0.800000 // buy
					if( bearPower > -0.463769 )
						if( tema <= 50.8717 )
							if( tema <= 48.6301 )
								ret := 0.800000 // buy
							if( tema > 48.6301 )
								if( bearPower <= -0.343883 )
									ret := -0.352941
								if( bearPower > -0.343883 )
									ret := -0.760000 // sell
						if( tema > 50.8717 )
							ret := 1.000000 // buy
				if( ema13 > -0.295519 )
					if( tema <= 49.0979 )
						if( bullPower <= 0.11632 )
							ret := 1.000000 // buy
						if( bullPower > 0.11632 )
							ret := 0.750000 // buy
					if( tema > 49.0979 )
						if( bbm <= 0.367883 )
							if( bearPower <= -0.403823 )
								if( bbp <= -0.624484 )
									ret := 0.750000 // buy
								if( bbp > -0.624484 )
									ret := -0.200000
							if( bearPower > -0.403823 )
								if( ema1 <= 49.8128 )
									ret := 0.897436 // buy
								if( ema1 > 49.8128 )
									ret := 0.666667
						if( bbm > 0.367883 )
							if( bearPower <= -0.157951 )
								if( bbp <= -0.407116 )
									ret := 0.733333 // buy
								if( bbp > -0.407116 )
									ret := -0.025000
							if( bearPower > -0.157951 )
								if( ema3 <= 49.9038 )
									ret := 0.250000
								if( ema3 > 49.9038 )
									ret := 0.933333 // buy
			if( ema12 > 0.092321 )
				if( bbm <= 0.326032 )
					if( bullPower <= 0.274064 )
						if( ema1 <= 50.3943 )
							ret := 0.400000
						if( ema1 > 50.3943 )
							ret := -0.714286 // sell
					if( bullPower > 0.274064 )
						if( ema13 <= 0.311956 )
							if( tema <= 49.763 )
								ret := -0.333333
							if( tema > 49.763 )
								if( ema12 <= 0.13416 )
									ret := 0.434783
								if( ema12 > 0.13416 )
									ret := 0.825000 // buy
						if( ema13 > 0.311956 )
							if( ema2 <= 50.651 )
								if( bbp <= 0.801534 )
									ret := 1.000000 // buy
								if( bbp > 0.801534 )
									ret := 0.333333
							if( ema2 > 50.651 )
								if( ema12 <= 0.246043 )
									ret := -0.777778 // sell
								if( ema12 > 0.246043 )
									ret := 0.333333
				if( bbm > 0.326032 )
					if( bearPower <= 0.318957 )
						if( bearPower <= -0.139724 )
							ret := 0.333333
						if( bearPower > -0.139724 )
							if( ema3 <= 49.6247 )
								if( ema12 <= 0.169345 )
									ret := -1.000000 // sell
								if( ema12 > 0.169345 )
									ret := -0.625000
							if( ema3 > 49.6247 )
								if( ema2 <= 49.8312 )
									ret := 0.750000 // buy
								if( ema2 > 49.8312 )
									ret := -0.607143
					if( bearPower > 0.318957 )
						ret := 1.000000 // buy
	if( ema2 > 51.2714 )
		if( bullPower <= 0.001256 )
			if( ema1 <= 243.135 )
				if( bbm <= 0.52986 )
					if( ema13 <= -0.569329 )
						if( ema3 <= 64.342 )
							if( bullPower <= -0.494851 )
								if( bearPower <= -0.920157 )
									ret := 1.000000 // buy
								if( bearPower > -0.920157 )
									ret := 0.862069 // buy
							if( bullPower > -0.494851 )
								if( ema1 <= 51.4554 )
									ret := 0.818182 // buy
								if( ema1 > 51.4554 )
									ret := -0.039216
						if( ema3 > 64.342 )
							if( ema12 <= -0.411642 )
								if( bearPower <= -0.761999 )
									ret := 0.245570
								if( bearPower > -0.761999 )
									ret := 0.005571
							if( ema12 > -0.411642 )
								if( ema2 <= 237.457 )
									ret := 0.308260
								if( ema2 > 237.457 )
									ret := 0.807018 // buy
					if( ema13 > -0.569329 )
						if( ema1 <= 51.2309 )
							if( tema <= 50.7764 )
								if( bbp <= -0.924988 )
									ret := -0.750000 // sell
								if( bbp > -0.924988 )
									ret := -1.000000 // sell
							if( tema > 50.7764 )
								if( bearPower <= -0.166981 )
									ret := 0.250000
								if( bearPower > -0.166981 )
									ret := -0.900000 // sell
						if( ema1 > 51.2309 )
							if( ema3 <= 242.694 )
								if( tema <= 57.3154 )
									ret := 0.196957
								if( tema > 57.3154 )
									ret := 0.093080
							if( ema3 > 242.694 )
								if( bbm <= 0.290523 )
									ret := 0.944444 // buy
								if( bbm > 0.290523 )
									ret := 0.250000
				if( bbm > 0.52986 )
					if( bbp <= -2.54275 )
						if( ema3 <= 156.481 )
							if( bbp <= -5.46672 )
								if( tema <= 136.488 )
									ret := 1.000000 // buy
								if( tema > 136.488 )
									ret := -0.322581
							if( bbp > -5.46672 )
								if( ema3 <= 137.888 )
									ret := 0.235849
								if( ema3 > 137.888 )
									ret := 0.748603 // buy
						if( ema3 > 156.481 )
							if( bearPower <= -6.89271 )
								ret := 1.000000 // buy
							if( bearPower > -6.89271 )
								if( ema13 <= -4.61006 )
									ret := -0.625000
								if( ema13 > -4.61006 )
									ret := 0.108052
					if( bbp > -2.54275 )
						if( ema3 <= 239.782 )
							if( ema13 <= -2.13201 )
								if( ema1 <= 194.626 )
									ret := 0.352941
								if( ema1 > 194.626 )
									ret := -0.886792 // sell
							if( ema13 > -2.13201 )
								if( ema2 <= 91.143 )
									ret := -0.273632
								if( ema2 > 91.143 )
									ret := 0.020416
						if( ema3 > 239.782 )
							if( ema2 <= 243.39 )
								if( ema13 <= -0.437803 )
									ret := 0.545455
								if( ema13 > -0.437803 )
									ret := 0.166667
							if( ema2 > 243.39 )
								if( ema13 <= -1.12913 )
									ret := 0.400000
								if( ema13 > -1.12913 )
									ret := -0.833333 // sell
			if( ema1 > 243.135 )
				if( ema3 <= 246.095 )
					if( bearPower <= -0.746278 )
						if( ema2 <= 243.733 )
							ret := 0.285714
						if( ema2 > 243.733 )
							if( ema2 <= 245.192 )
								if( ema1 <= 243.353 )
									ret := -0.894737 // sell
								if( ema1 > 243.353 )
									ret := -0.393939
							if( ema2 > 245.192 )
								if( ema13 <= -0.313258 )
									ret := -0.941176 // sell
								if( ema13 > -0.313258 )
									ret := -0.500000
					if( bearPower > -0.746278 )
						if( tema <= 244.686 )
							if( ema2 <= 244.42 )
								ret := 0.000000
							if( ema2 > 244.42 )
								ret := -0.857143 // sell
						if( tema > 244.686 )
							if( ema3 <= 245.996 )
								if( ema2 <= 245.649 )
									ret := 0.700000 // buy
								if( ema2 > 245.649 )
									ret := -0.250000
							if( ema3 > 245.996 )
								ret := -0.500000
				if( ema3 > 246.095 )
					if( ema3 <= 246.919 )
						if( ema12 <= -1.04539 )
							ret := -0.250000
						if( ema12 > -1.04539 )
							if( ema2 <= 246.177 )
								if( bbp <= -2.1591 )
									ret := 0.764706 // buy
								if( bbp > -2.1591 )
									ret := -0.222222
							if( ema2 > 246.177 )
								if( bullPower <= -0.212272 )
									ret := 0.968750 // buy
								if( bullPower > -0.212272 )
									ret := 0.666667
					if( ema3 > 246.919 )
						if( ema13 <= -0.459494 )
							if( bearPower <= -8.35393 )
								if( bbm <= 8.50974 )
									ret := 0.868421 // buy
								if( bbm > 8.50974 )
									ret := 0.142857
							if( bearPower > -8.35393 )
								if( bearPower <= -6.1595 )
									ret := -0.360000
								if( bearPower > -6.1595 )
									ret := 0.073992
						if( ema13 > -0.459494 )
							if( ema2 <= 252.499 )
								if( ema1 <= 247.166 )
									ret := 0.636364
								if( ema1 > 247.166 )
									ret := -0.448000
							if( ema2 > 252.499 )
								if( bbm <= 0.420406 )
									ret := 0.036711
								if( bbm > 0.420406 )
									ret := -0.107939
		if( bullPower > 0.001256 )
			if( bbp <= 5.01071 )
				if( ema1 <= 66.1712 )
					if( ema1 <= 51.6849 )
						if( ema2 <= 51.4474 )
							if( ema3 <= 51.356 )
								if( ema13 <= 0.018054 )
									ret := -0.800000 // sell
								if( ema13 > 0.018054 )
									ret := 0.014706
							if( ema3 > 51.356 )
								if( tema <= 51.3629 )
									ret := 0.083333
								if( tema > 51.3629 )
									ret := 0.789474 // buy
						if( ema2 > 51.4474 )
							if( bbm <= 0.869756 )
								if( ema1 <= 51.6788 )
									ret := -0.884615 // sell
								if( ema1 > 51.6788 )
									ret := -0.200000
							if( bbm > 0.869756 )
								ret := 0.000000
					if( ema1 > 51.6849 )
						if( ema2 <= 51.8366 )
							if( ema3 <= 51.5776 )
								if( ema13 <= 0.229263 )
									ret := -0.888889 // sell
								if( ema13 > 0.229263 )
									ret := 0.146341
							if( ema3 > 51.5776 )
								if( ema3 <= 51.7859 )
									ret := 0.732394 // buy
								if( ema3 > 51.7859 )
									ret := 0.163636
						if( ema2 > 51.8366 )
							if( ema13 <= 0.114247 )
								if( ema1 <= 52.5101 )
									ret := -0.233216
								if( ema1 > 52.5101 )
									ret := 0.025200
							if( ema13 > 0.114247 )
								if( ema12 <= 0.175041 )
									ret := -0.189311
								if( ema12 > 0.175041 )
									ret := 0.043668
				if( ema1 > 66.1712 )
					if( ema3 <= 423.37 )
						if( ema12 <= -2.55941 )
							ret := 1.000000 // buy
						if( ema12 > -2.55941 )
							if( tema <= 66.4987 )
								ret := 1.000000 // buy
							if( tema > 66.4987 )
								if( ema1 <= 106.761 )
									ret := 0.085165
								if( ema1 > 106.761 )
									ret := 0.035389
					if( ema3 > 423.37 )
						if( bbp <= -0.805582 )
							if( ema3 <= 426.833 )
								if( ema3 <= 425.42 )
									ret := -0.117647
								if( ema3 > 425.42 )
									ret := -1.000000 // sell
							if( ema3 > 426.833 )
								if( ema1 <= 462.884 )
									ret := 0.351562
								if( ema1 > 462.884 )
									ret := -0.714286 // sell
						if( bbp > -0.805582 )
							if( ema13 <= -1.36042 )
								if( ema12 <= -1.20148 )
									ret := 0.250000
								if( ema12 > -1.20148 )
									ret := -0.793103 // sell
							if( ema13 > -1.36042 )
								if( bbm <= 3.56334 )
									ret := -0.112941
								if( bbm > 3.56334 )
									ret := -0.638889
			if( bbp > 5.01071 )
				if( ema3 <= 163.288 )
					if( bullPower <= 3.86996 )
						if( ema13 <= 2.33859 )
							if( bearPower <= 1.90655 )
								ret := 0.142857
							if( bearPower > 1.90655 )
								if( bearPower <= 2.53975 )
									ret := 1.000000 // buy
								if( bearPower > 2.53975 )
									ret := 0.750000 // buy
						if( ema13 > 2.33859 )
							if( ema12 <= 2.14992 )
								if( ema13 <= 2.86144 )
									ret := -0.200000
								if( ema13 > 2.86144 )
									ret := -1.000000 // sell
							if( ema12 > 2.14992 )
								ret := -0.250000
					if( bullPower > 3.86996 )
						if( bullPower <= 5.25193 )
							if( ema3 <= 146.689 )
								ret := -1.000000 // sell
							if( ema3 > 146.689 )
								if( tema <= 160.556 )
									ret := -0.461538
								if( tema > 160.556 )
									ret := -1.000000 // sell
						if( bullPower > 5.25193 )
							if( ema2 <= 146.603 )
								if( ema2 <= 144.205 )
									ret := -0.700000 // sell
								if( ema2 > 144.205 )
									ret := -1.000000 // sell
							if( ema2 > 146.603 )
								if( bbp <= 8.84836 )
									ret := 0.875000 // buy
								if( bbp > 8.84836 )
									ret := -0.750000 // sell
				if( ema3 > 163.288 )
					if( tema <= 241.666 )
						if( tema <= 230.997 )
							if( ema2 <= 169.485 )
								if( bbp <= 5.76372 )
									ret := 1.000000 // buy
								if( bbp > 5.76372 )
									ret := 0.500000
							if( ema2 > 169.485 )
								if( ema1 <= 206.857 )
									ret := -0.514286
								if( ema1 > 206.857 )
									ret := -0.041096
						if( tema > 230.997 )
							if( bbm <= 3.12 )
								if( bearPower <= 1.98185 )
									ret := 0.000000
								if( bearPower > 1.98185 )
									ret := 0.720000 // buy
							if( bbm > 3.12 )
								ret := -0.857143 // sell
					if( tema > 241.666 )
						if( ema2 <= 265.738 )
							if( ema1 <= 240.35 )
								if( tema <= 242.091 )
									ret := -0.500000
								if( tema > 242.091 )
									ret := -0.962963 // sell
							if( ema1 > 240.35 )
								if( ema2 <= 242.6 )
									ret := 0.400000
								if( ema2 > 242.6 )
									ret := -0.473054
						if( ema2 > 265.738 )
							if( ema1 <= 300.087 )
								if( bbp <= 6.13937 )
									ret := -0.097087
								if( bbp > 6.13937 )
									ret := 0.377049
							if( ema1 > 300.087 )
								if( ema3 <= 306.39 )
									ret := -0.704918 // sell
								if( ema3 > 306.39 )
									ret := -0.160401
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


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
float op_operation = decision_tree_0_MSFT_30Min_a1f86e22(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

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


