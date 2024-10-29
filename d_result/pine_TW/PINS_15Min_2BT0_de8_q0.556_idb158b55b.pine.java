//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: PINS_15Min_2BT0_b158b55b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PINS_15Min_2BT0_b158b55b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PINS_15Min_b158b55b(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.067884 )
		if( bbm <= 0.049842 )
			if( bbp <= -0.29179 )
				if( ema3 <= 18.6031 )
					if( bbp <= -0.721427 )
						if( ema3 <= 13.6792 )
							ret := -0.500000
						if( ema3 > 13.6792 )
							if( ema12 <= -0.251313 )
								ret := -1.000000 // sell
							if( ema12 > -0.251313 )
								if( tema <= 15.0077 )
									ret := -0.857143 // sell
								if( tema > 15.0077 )
									ret := -0.250000
					if( bbp > -0.721427 )
						if( bbm <= 0.030661 )
							if( ema12 <= -0.124532 )
								if( ema13 <= -0.369663 )
									ret := -0.600000
								if( ema13 > -0.369663 )
									ret := 0.708333 // buy
							if( ema12 > -0.124532 )
								if( ema13 <= -0.072053 )
									ret := -0.531250
								if( ema13 > -0.072053 )
									ret := 0.727273 // buy
						if( bbm > 0.030661 )
							ret := -1.000000 // sell
				if( ema3 > 18.6031 )
					if( ema3 <= 55.6207 )
						if( ema3 <= 23.1383 )
							if( ema2 <= 20.8473 )
								if( bullPower <= -0.19775 )
									ret := 0.656566
								if( bullPower > -0.19775 )
									ret := 0.029412
							if( ema2 > 20.8473 )
								if( tema <= 21.4901 )
									ret := 0.928571 // buy
								if( tema > 21.4901 )
									ret := 0.647059
						if( ema3 > 23.1383 )
							if( ema12 <= -0.084486 )
								if( bearPower <= -0.312387 )
									ret := 0.408654
								if( bearPower > -0.312387 )
									ret := 0.197802
							if( ema12 > -0.084486 )
								if( ema1 <= 24.26 )
									ret := 0.208333
								if( ema1 > 24.26 )
									ret := 0.605634
					if( ema3 > 55.6207 )
						if( ema12 <= -0.633861 )
							if( ema3 <= 78.2632 )
								if( ema2 <= 73.215 )
									ret := 0.666667
								if( ema2 > 73.215 )
									ret := 0.000000
							if( ema3 > 78.2632 )
								ret := 1.000000 // buy
						if( ema12 > -0.633861 )
							if( bearPower <= -0.474644 )
								if( ema12 <= -0.230891 )
									ret := 0.100000
								if( ema12 > -0.230891 )
									ret := -0.838710 // sell
							if( bearPower > -0.474644 )
								if( ema13 <= -0.346951 )
									ret := -0.123077
								if( ema13 > -0.346951 )
									ret := 0.217391
			if( bbp > -0.29179 )
				if( ema12 <= -0.027429 )
					if( bbp <= -0.089709 )
						if( ema13 <= -0.168748 )
							if( ema3 <= 23.2464 )
								if( tema <= 12.3247 )
									ret := -0.600000
								if( tema > 12.3247 )
									ret := 0.400000
							if( ema3 > 23.2464 )
								if( bbm <= 0.031492 )
									ret := 0.018182
								if( bbm > 0.031492 )
									ret := -0.358491
						if( ema13 > -0.168748 )
							if( ema3 <= 27.4995 )
								if( tema <= 26.2912 )
									ret := 0.180778
								if( tema > 26.2912 )
									ret := -0.208589
							if( ema3 > 27.4995 )
								if( ema3 <= 32.8592 )
									ret := 0.432900
								if( ema3 > 32.8592 )
									ret := 0.223382
					if( bbp > -0.089709 )
						if( ema2 <= 20.8178 )
							if( ema3 <= 19.8317 )
								if( ema2 <= 15.7339 )
									ret := -0.666667
								if( ema2 > 15.7339 )
									ret := -0.030303
							if( ema3 > 19.8317 )
								if( tema <= 20.2994 )
									ret := -0.888889 // sell
								if( tema > 20.2994 )
									ret := -0.400000
						if( ema2 > 20.8178 )
							if( ema1 <= 21.5427 )
								if( ema1 <= 21.495 )
									ret := 0.250000
								if( ema1 > 21.495 )
									ret := 1.000000 // buy
							if( ema1 > 21.5427 )
								if( ema13 <= -0.147996 )
									ret := -0.342105
								if( ema13 > -0.147996 )
									ret := 0.056604
				if( ema12 > -0.027429 )
					if( ema2 <= 34.7743 )
						if( ema2 <= 20.7106 )
							if( ema2 <= 19.5601 )
								if( ema13 <= 0.019603 )
									ret := 0.329670
								if( ema13 > 0.019603 )
									ret := -0.205882
							if( ema2 > 19.5601 )
								if( bbp <= -0.150697 )
									ret := 0.500000
								if( bbp > -0.150697 )
									ret := -0.425000
						if( ema2 > 20.7106 )
							if( bullPower <= -0.059995 )
								if( bbp <= -0.210844 )
									ret := 0.243590
								if( bbp > -0.210844 )
									ret := 0.533808
							if( bullPower > -0.059995 )
								if( ema13 <= -0.034468 )
									ret := 0.536585
								if( ema13 > -0.034468 )
									ret := 0.196850
					if( ema2 > 34.7743 )
						if( ema2 <= 34.8126 )
							if( ema12 <= 0.00051 )
								ret := -0.500000
							if( ema12 > 0.00051 )
								ret := -1.000000 // sell
						if( ema2 > 34.8126 )
							if( bullPower <= -0.03594 )
								if( ema2 <= 34.9659 )
									ret := 0.545455
								if( ema2 > 34.9659 )
									ret := 0.030973
							if( bullPower > -0.03594 )
								if( ema13 <= 0.065944 )
									ret := 0.181818
								if( ema13 > 0.065944 )
									ret := 0.777778 // buy
		if( bbm > 0.049842 )
			if( ema1 <= 86.7486 )
				if( bullPower <= -0.242553 )
					if( ema3 <= 27.6398 )
						if( ema1 <= 21.7616 )
							if( ema1 <= 18.9821 )
								if( ema1 <= 14.9194 )
									ret := 0.104478
								if( ema1 > 14.9194 )
									ret := 0.608187
							if( ema1 > 18.9821 )
								if( ema1 <= 19.5651 )
									ret := -0.685185
								if( ema1 > 19.5651 )
									ret := 0.099138
						if( ema1 > 21.7616 )
							if( bearPower <= -0.411449 )
								if( tema <= 27.0336 )
									ret := 0.509749
								if( tema > 27.0336 )
									ret := -0.800000 // sell
							if( bearPower > -0.411449 )
								if( bbm <= 0.114423 )
									ret := 0.392157
								if( bbm > 0.114423 )
									ret := -0.384615
					if( ema3 > 27.6398 )
						if( ema3 <= 73.0183 )
							if( ema13 <= -0.818772 )
								if( bbm <= 0.78076 )
									ret := 0.227481
								if( bbm > 0.78076 )
									ret := 0.576271
							if( ema13 > -0.818772 )
								if( bbm <= 0.642397 )
									ret := 0.117250
								if( bbm > 0.642397 )
									ret := -0.311765
						if( ema3 > 73.0183 )
							if( bbp <= -3.73607 )
								if( bbm <= 2.54155 )
									ret := 0.589286
								if( bbm > 2.54155 )
									ret := -1.000000 // sell
							if( bbp > -3.73607 )
								if( ema12 <= -0.261217 )
									ret := -0.233193
								if( ema12 > -0.261217 )
									ret := 0.393443
				if( bullPower > -0.242553 )
					if( ema2 <= 74.9804 )
						if( ema2 <= 73.8533 )
							if( ema1 <= 10.9265 )
								ret := 1.000000 // buy
							if( ema1 > 10.9265 )
								if( ema1 <= 14.5991 )
									ret := -0.142518
								if( ema1 > 14.5991 )
									ret := 0.065547
						if( ema2 > 73.8533 )
							if( ema12 <= 0.008945 )
								if( ema1 <= 73.759 )
									ret := -0.969697 // sell
								if( ema1 > 73.759 )
									ret := -0.775510 // sell
							if( ema12 > 0.008945 )
								if( bbm <= 0.277188 )
									ret := -1.000000 // sell
								if( bbm > 0.277188 )
									ret := 0.111111
					if( ema2 > 74.9804 )
						if( ema13 <= -0.80917 )
							if( bullPower <= -0.187702 )
								if( bbp <= -1.18351 )
									ret := 0.750000 // buy
								if( bbp > -1.18351 )
									ret := 0.000000
							if( bullPower > -0.187702 )
								if( bullPower <= 0.15891 )
									ret := -0.638889
								if( bullPower > 0.15891 )
									ret := 0.400000
						if( ema13 > -0.80917 )
							if( ema1 <= 75.6799 )
								if( ema1 <= 74.9477 )
									ret := 0.000000
								if( ema1 > 74.9477 )
									ret := 0.791045 // buy
							if( ema1 > 75.6799 )
								if( ema2 <= 76.1735 )
									ret := -0.444444
								if( ema2 > 76.1735 )
									ret := 0.274648
			if( ema1 > 86.7486 )
				if( ema12 <= 0.029318 )
					if( tema <= 86.836 )
						if( tema <= 86.4605 )
							ret := -1.000000 // sell
						if( tema > 86.4605 )
							if( ema13 <= -0.312143 )
								ret := -0.250000
							if( ema13 > -0.312143 )
								ret := -1.000000 // sell
					if( tema > 86.836 )
						if( ema1 <= 88.922 )
							ret := -1.000000 // sell
						if( ema1 > 88.922 )
							ret := -0.750000 // sell
				if( ema12 > 0.029318 )
					ret := 0.200000
	if( bbp > -0.067884 )
		if( bbp <= 0.707665 )
			if( ema12 <= 0.214056 )
				if( bearPower <= 0.049239 )
					if( ema1 <= 84.4421 )
						if( bbm <= 0.67996 )
							if( ema13 <= 0.005445 )
								if( ema2 <= 69.607 )
									ret := -0.007907
								if( ema2 > 69.607 )
									ret := 0.258900
							if( ema13 > 0.005445 )
								if( ema1 <= 35.5675 )
									ret := 0.082127
								if( ema1 > 35.5675 )
									ret := -0.018640
						if( bbm > 0.67996 )
							if( bullPower <= 0.805202 )
								if( ema1 <= 74.5268 )
									ret := -0.249548
								if( ema1 > 74.5268 )
									ret := 0.220588
							if( bullPower > 0.805202 )
								if( bbm <= 1.3828 )
									ret := 0.636364
								if( bbm > 1.3828 )
									ret := -0.047619
					if( ema1 > 84.4421 )
						if( bearPower <= -0.282142 )
							if( ema12 <= -0.019008 )
								ret := -0.500000
							if( ema12 > -0.019008 )
								ret := -1.000000 // sell
						if( bearPower > -0.282142 )
							if( ema13 <= -0.146338 )
								if( ema1 <= 85.4676 )
									ret := 0.750000 // buy
								if( ema1 > 85.4676 )
									ret := 0.000000
							if( ema13 > -0.146338 )
								if( ema12 <= -0.016353 )
									ret := -0.884615 // sell
								if( ema12 > -0.016353 )
									ret := -0.220000
				if( bearPower > 0.049239 )
					if( ema3 <= 13.6479 )
						if( ema12 <= 0.116002 )
							if( ema13 <= 0.218626 )
								if( tema <= 11.6539 )
									ret := -0.250000
								if( tema > 11.6539 )
									ret := 0.953488 // buy
							if( ema13 > 0.218626 )
								ret := -0.500000
						if( ema12 > 0.116002 )
							if( ema2 <= 12.4973 )
								if( ema12 <= 0.139709 )
									ret := -1.000000 // sell
								if( ema12 > 0.139709 )
									ret := -0.166667
							if( ema2 > 12.4973 )
								if( ema12 <= 0.163499 )
									ret := 0.714286 // buy
								if( ema12 > 0.163499 )
									ret := -0.285714
					if( ema3 > 13.6479 )
						if( bbm <= 0.039664 )
							if( tema <= 64.5483 )
								if( bbp <= 0.354638 )
									ret := -0.116983
								if( bbp > 0.354638 )
									ret := -0.290278
							if( tema > 64.5483 )
								if( bbm <= 0.03181 )
									ret := 0.114754
								if( bbm > 0.03181 )
									ret := 1.000000 // buy
						if( bbm > 0.039664 )
							if( ema3 <= 14.7872 )
								if( ema3 <= 14.0183 )
									ret := -0.125000
								if( ema3 > 14.0183 )
									ret := -0.823529 // sell
							if( ema3 > 14.7872 )
								if( ema3 <= 16.7325 )
									ret := 0.396552
								if( ema3 > 16.7325 )
									ret := 0.005524
			if( ema12 > 0.214056 )
				if( ema3 <= 27.6381 )
					if( ema1 <= 12.308 )
						ret := -1.000000 // sell
					if( ema1 > 12.308 )
						if( bearPower <= 0.227082 )
							if( bullPower <= 0.278806 )
								if( ema3 <= 21.2266 )
									ret := -0.545455
								if( ema3 > 21.2266 )
									ret := 0.217391
							if( bullPower > 0.278806 )
								if( bearPower <= 0.224928 )
									ret := 0.260450
								if( bearPower > 0.224928 )
									ret := -1.000000 // sell
						if( bearPower > 0.227082 )
							if( ema1 <= 23.2552 )
								if( ema2 <= 22.5225 )
									ret := 0.581081
								if( ema2 > 22.5225 )
									ret := 0.954545 // buy
							if( ema1 > 23.2552 )
								if( ema13 <= 0.490578 )
									ret := 0.500000
								if( ema13 > 0.490578 )
									ret := -0.562500
				if( ema3 > 27.6381 )
					if( ema1 <= 37.6026 )
						if( bbm <= 0.346283 )
							if( ema3 <= 35.0806 )
								if( bullPower <= 0.405667 )
									ret := -0.033708
								if( bullPower > 0.405667 )
									ret := -0.473684
							if( ema3 > 35.0806 )
								if( tema <= 37.2901 )
									ret := 0.289474
								if( tema > 37.2901 )
									ret := -0.454545
						if( bbm > 0.346283 )
							if( ema3 <= 32.3426 )
								if( tema <= 31.4782 )
									ret := -0.666667
								if( tema > 31.4782 )
									ret := 0.857143 // buy
							if( ema3 > 32.3426 )
								if( ema1 <= 35.7391 )
									ret := -0.825000 // sell
								if( ema1 > 35.7391 )
									ret := -0.440000
					if( ema1 > 37.6026 )
						if( tema <= 38.9969 )
							if( tema <= 38.5599 )
								if( ema2 <= 38.0033 )
									ret := 0.571429
								if( ema2 > 38.0033 )
									ret := -0.750000 // sell
							if( tema > 38.5599 )
								if( bearPower <= 0.198079 )
									ret := 1.000000 // buy
								if( bearPower > 0.198079 )
									ret := 0.750000 // buy
						if( tema > 38.9969 )
							if( ema1 <= 64.3085 )
								if( ema3 <= 48.2579 )
									ret := 0.179104
								if( ema3 > 48.2579 )
									ret := -0.128205
							if( ema1 > 64.3085 )
								if( ema2 <= 66.1936 )
									ret := 0.634921
								if( ema2 > 66.1936 )
									ret := 0.204301
		if( bbp > 0.707665 )
			if( ema12 <= 1.17412 )
				if( tema <= 20.0224 )
					if( ema2 <= 16.9498 )
						if( ema3 <= 11.689 )
							if( tema <= 12.6182 )
								if( bbp <= 1.575 )
									ret := 1.000000 // buy
								if( bbp > 1.575 )
									ret := 0.750000 // buy
							if( tema > 12.6182 )
								if( ema13 <= 0.841838 )
									ret := -0.750000 // sell
								if( ema13 > 0.841838 )
									ret := 0.777778 // buy
						if( ema3 > 11.689 )
							if( tema <= 13.1284 )
								if( tema <= 12.7769 )
									ret := -1.000000 // sell
								if( tema > 12.7769 )
									ret := -0.777778 // sell
							if( tema > 13.1284 )
								if( ema3 <= 13.8982 )
									ret := 0.615385
								if( ema3 > 13.8982 )
									ret := -0.456522
					if( ema2 > 16.9498 )
						if( bbm <= 0.078093 )
							ret := -1.000000 // sell
						if( bbm > 0.078093 )
							if( tema <= 19.0419 )
								if( ema12 <= 0.135476 )
									ret := -0.600000
								if( ema12 > 0.135476 )
									ret := 0.815217 // buy
							if( tema > 19.0419 )
								if( tema <= 19.3925 )
									ret := -0.392857
								if( tema > 19.3925 )
									ret := 0.592593
				if( tema > 20.0224 )
					if( bbm <= 0.099909 )
						if( ema3 <= 32.131 )
							if( bullPower <= 0.4995 )
								if( bbp <= 0.947319 )
									ret := -0.554217
								if( bbp > 0.947319 )
									ret := 0.750000 // buy
							if( bullPower > 0.4995 )
								if( ema12 <= 0.21612 )
									ret := -0.970588 // sell
								if( ema12 > 0.21612 )
									ret := -0.677419
						if( ema3 > 32.131 )
							if( tema <= 34.4088 )
								if( ema1 <= 32.7614 )
									ret := -0.111111
								if( ema1 > 32.7614 )
									ret := 0.850000 // buy
							if( tema > 34.4088 )
								if( tema <= 72.4792 )
									ret := -0.378788
								if( tema > 72.4792 )
									ret := -0.025316
					if( bbm > 0.099909 )
						if( ema3 <= 72.571 )
							if( ema3 <= 19.6261 )
								if( bbm <= 0.404715 )
									ret := -0.760000 // sell
								if( bbm > 0.404715 )
									ret := 0.142857
							if( ema3 > 19.6261 )
								if( ema2 <= 20.1573 )
									ret := 0.607143
								if( ema2 > 20.1573 )
									ret := -0.048302
						if( ema3 > 72.571 )
							if( ema13 <= 0.773446 )
								if( bbp <= 2.14208 )
									ret := -0.178824
								if( bbp > 2.14208 )
									ret := -0.705882 // sell
							if( ema13 > 0.773446 )
								if( ema1 <= 74.901 )
									ret := -0.745763 // sell
								if( ema1 > 74.901 )
									ret := -0.368794
			if( ema12 > 1.17412 )
				if( ema1 <= 58.3489 )
					if( tema <= 31.0648 )
						if( ema13 <= 2.1998 )
							if( ema13 <= 2.01366 )
								ret := 0.500000
							if( ema13 > 2.01366 )
								ret := -0.500000
						if( ema13 > 2.1998 )
							if( bbp <= 2.79279 )
								ret := 1.000000 // buy
							if( bbp > 2.79279 )
								ret := 0.750000 // buy
					if( tema > 31.0648 )
						if( ema2 <= 28.4406 )
							if( ema1 <= 29.8754 )
								if( bullPower <= 3.93889 )
									ret := -1.000000 // sell
								if( bullPower > 3.93889 )
									ret := -0.500000
							if( ema1 > 29.8754 )
								ret := 0.500000
						if( ema2 > 28.4406 )
							if( ema12 <= 1.54206 )
								ret := -0.428571
							if( ema12 > 1.54206 )
								ret := -1.000000 // sell
				if( ema1 > 58.3489 )
					if( ema3 <= 82.257 )
						if( ema1 <= 83.7969 )
							if( ema3 <= 78.9229 )
								if( bearPower <= 1.29413 )
									ret := 0.333333
								if( bearPower > 1.29413 )
									ret := 0.868852 // buy
							if( ema3 > 78.9229 )
								if( ema13 <= 2.64766 )
									ret := 0.750000 // buy
								if( ema13 > 2.64766 )
									ret := -0.166667
						if( ema1 > 83.7969 )
							ret := 1.000000 // buy
					if( ema3 > 82.257 )
						if( bearPower <= 1.33942 )
							ret := -0.800000 // sell
						if( bearPower > 1.33942 )
							ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_PINS_15Min_b158b55b(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

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


