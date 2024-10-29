//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: NIO_5Min_1MAD_30cbf9ad Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NIO_5Min_1MAD_30cbf9ad", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NIO_5Min_30cbf9ad(ma15, ma70_colorInt, ma75_colorInt, ma70, ma40_colorInt, ma80_colorInt, ma20, ma20_colorInt, ma60, ma50, ma65_colorInt, ma45, ma55, ma05_colorInt, ma35_colorInt, ma10_colorInt, ma30, ma25_colorInt, ma100, ma65, ma85, ma80, ma60_colorInt, ma85_colorInt, ma90, ma90_colorInt, ma25, ma40, ma50_colorInt, ma35, ma30_colorInt, ma45_colorInt, ma05, ma75, ma55_colorInt, ma10, ma15_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ma30_colorInt <= 1.5 )
		if( ma65 <= 7.39092 )
			if( ma65 <= 6.77539 )
				if( ma35 <= 6.35313 )
					if( ma15 <= 6.06736 )
						if( ma25 <= 5.83054 )
							if( ma05 <= 5.83015 )
								if( ma80 <= 5.79065 )
									ret := -0.077079
								if( ma80 > 5.79065 )
									ret := -0.754717 // sell
							if( ma05 > 5.83015 )
								if( ma85 <= 5.77704 )
									ret := -0.721739 // sell
								if( ma85 > 5.77704 )
									ret := -0.113636
						if( ma25 > 5.83054 )
							if( ma90 <= 5.87295 )
								if( ma15 <= 5.92425 )
									ret := 0.198529
								if( ma15 > 5.92425 )
									ret := 0.615942
							if( ma90 > 5.87295 )
								if( ma100 <= 5.91974 )
									ret := -0.357388
								if( ma100 > 5.91974 )
									ret := 0.117241
					if( ma15 > 6.06736 )
						if( ma15 <= 6.32069 )
							if( ma25_colorInt <= 1.5 )
								if( ma05_colorInt <= 1.5 )
									ret := -0.184492
								if( ma05_colorInt > 1.5 )
									ret := -0.390135
							if( ma25_colorInt > 1.5 )
								if( ma60 <= 6.10675 )
									ret := -0.583333
								if( ma60 > 6.10675 )
									ret := 0.807692 // buy
						if( ma15 > 6.32069 )
							if( ma70 <= 6.20627 )
								if( ma15 <= 6.42302 )
									ret := -1.000000 // sell
								if( ma15 > 6.42302 )
									ret := -0.692308
							if( ma70 > 6.20627 )
								if( ma90 <= 6.20807 )
									ret := 0.444444
								if( ma90 > 6.20807 )
									ret := -0.546667
				if( ma35 > 6.35313 )
					if( ma55 <= 6.36186 )
						if( ma60 <= 6.29884 )
							ret := 0.222222
						if( ma60 > 6.29884 )
							if( ma40 <= 6.37413 )
								if( ma65 <= 6.33602 )
									ret := 1.000000 // buy
								if( ma65 > 6.33602 )
									ret := 0.888889 // buy
							if( ma40 > 6.37413 )
								if( ma100 <= 6.24169 )
									ret := 0.888889 // buy
								if( ma100 > 6.24169 )
									ret := 0.000000
					if( ma55 > 6.36186 )
						if( ma50 <= 6.53093 )
							if( ma10 <= 6.56234 )
								if( ma100 <= 6.39283 )
									ret := -0.159292
								if( ma100 > 6.39283 )
									ret := 0.419753
							if( ma10 > 6.56234 )
								if( ma35 <= 6.53899 )
									ret := -1.000000 // sell
								if( ma35 > 6.53899 )
									ret := -0.454545
						if( ma50 > 6.53093 )
							if( ma65 <= 6.7554 )
								if( ma60 <= 6.753 )
									ret := 0.372549
								if( ma60 > 6.753 )
									ret := 0.900000 // buy
							if( ma65 > 6.7554 )
								if( ma75 <= 6.76215 )
									ret := -0.136364
								if( ma75 > 6.76215 )
									ret := 0.545455
			if( ma65 > 6.77539 )
				if( ma20 <= 6.86568 )
					if( ma100 <= 6.7811 )
						ret := -0.133333
					if( ma100 > 6.7811 )
						if( ma10 <= 6.84736 )
							if( ma20 <= 6.83074 )
								if( ma80 <= 6.78424 )
									ret := -0.900000 // sell
								if( ma80 > 6.78424 )
									ret := -0.461538
							if( ma20 > 6.83074 )
								ret := -1.000000 // sell
						if( ma10 > 6.84736 )
							if( ma55 <= 6.82323 )
								ret := -0.076923
							if( ma55 > 6.82323 )
								ret := -1.000000 // sell
				if( ma20 > 6.86568 )
					if( ma50 <= 6.91691 )
						if( ma35 <= 6.91434 )
							if( ma05 <= 6.96648 )
								if( ma05 <= 6.89129 )
									ret := 0.066667
								if( ma05 > 6.89129 )
									ret := 0.631579
							if( ma05 > 6.96648 )
								ret := -0.538462
						if( ma35 > 6.91434 )
							if( ma05 <= 7.02164 )
								ret := 1.000000 // buy
							if( ma05 > 7.02164 )
								ret := 0.000000
					if( ma50 > 6.91691 )
						if( ma30 <= 7.45004 )
							if( ma15 <= 7.20311 )
								if( ma50_colorInt <= 2.5 )
									ret := -0.615385
								if( ma50_colorInt > 2.5 )
									ret := 0.214286
							if( ma15 > 7.20311 )
								if( ma75 <= 7.23585 )
									ret := 0.088028
								if( ma75 > 7.23585 )
									ret := -0.239502
						if( ma30 > 7.45004 )
							ret := -1.000000 // sell
		if( ma65 > 7.39092 )
			if( ma75 <= 15.0319 )
				if( ma70 <= 13.8293 )
					if( ma80 <= 13.604 )
						if( ma40_colorInt <= 2.5 )
							if( ma100 <= 12.9698 )
								if( ma80 <= 7.53238 )
									ret := 0.218566
								if( ma80 > 7.53238 )
									ret := -0.011929
							if( ma100 > 12.9698 )
								if( ma100 <= 13.5535 )
									ret := 0.606061
								if( ma100 > 13.5535 )
									ret := -0.307692
						if( ma40_colorInt > 2.5 )
							if( ma30 <= 9.11604 )
								if( ma25 <= 7.48738 )
									ret := -0.657895
								if( ma25 > 7.48738 )
									ret := 0.110345
							if( ma30 > 9.11604 )
								if( ma15 <= 9.31681 )
									ret := -1.000000 // sell
								if( ma15 > 9.31681 )
									ret := -0.447368
					if( ma80 > 13.604 )
						if( ma20_colorInt <= 1.5 )
							if( ma25 <= 13.7445 )
								ret := -1.000000 // sell
							if( ma25 > 13.7445 )
								if( ma85 <= 13.6632 )
									ret := -0.083333
								if( ma85 > 13.6632 )
									ret := -0.828125 // sell
						if( ma20_colorInt > 1.5 )
							ret := -0.250000
				if( ma70 > 13.8293 )
					if( ma15 <= 14.573 )
						if( ma50_colorInt <= 3 )
							if( ma30 <= 14.4437 )
								if( ma100 <= 13.9314 )
									ret := 0.916667 // buy
								if( ma100 > 13.9314 )
									ret := 0.284404
							if( ma30 > 14.4437 )
								ret := 1.000000 // buy
						if( ma50_colorInt > 3 )
							if( ma15 <= 14.1745 )
								ret := 0.625000
							if( ma15 > 14.1745 )
								ret := 1.000000 // buy
					if( ma15 > 14.573 )
						if( ma20 <= 14.6137 )
							if( ma15_colorInt <= 1.5 )
								if( ma20 <= 14.5934 )
									ret := -0.615385
								if( ma20 > 14.5934 )
									ret := -1.000000 // sell
							if( ma15_colorInt > 1.5 )
								ret := 0.800000 // buy
						if( ma20 > 14.6137 )
							if( ma100 <= 14.5011 )
								if( ma80 <= 14.5203 )
									ret := 0.466667
								if( ma80 > 14.5203 )
									ret := 1.000000 // buy
							if( ma100 > 14.5011 )
								if( ma100 <= 14.5282 )
									ret := -0.933333 // sell
								if( ma100 > 14.5282 )
									ret := 0.108374
			if( ma75 > 15.0319 )
				if( ma05 <= 15.3488 )
					if( ma85_colorInt <= 3 )
						if( ma05 <= 15.2074 )
							if( ma50 <= 15.0897 )
								ret := -1.000000 // sell
							if( ma50 > 15.0897 )
								if( ma50 <= 15.0938 )
									ret := -0.888889 // sell
								if( ma50 > 15.0938 )
									ret := -1.000000 // sell
						if( ma05 > 15.2074 )
							ret := -0.769231 // sell
					if( ma85_colorInt > 3 )
						ret := -0.600000
				if( ma05 > 15.3488 )
					if( ma100 <= 15.6655 )
						if( ma85 <= 15.4619 )
							if( ma60 <= 15.3592 )
								if( ma45 <= 15.2825 )
									ret := -0.422222
								if( ma45 > 15.2825 )
									ret := 0.239437
							if( ma60 > 15.3592 )
								if( ma90 <= 15.4211 )
									ret := -0.871429 // sell
								if( ma90 > 15.4211 )
									ret := -0.166667
						if( ma85 > 15.4619 )
							if( ma35 <= 15.6795 )
								if( ma80 <= 15.4878 )
									ret := 1.000000 // buy
								if( ma80 > 15.4878 )
									ret := 0.529412
							if( ma35 > 15.6795 )
								if( ma05 <= 15.7402 )
									ret := 0.000000
								if( ma05 > 15.7402 )
									ret := -0.444444
					if( ma100 > 15.6655 )
						if( ma50 <= 15.751 )
							ret := -0.777778 // sell
						if( ma50 > 15.751 )
							ret := -1.000000 // sell
	if( ma30_colorInt > 1.5 )
		if( ma75 <= 7.62334 )
			if( ma15_colorInt <= 3.5 )
				if( ma40 <= 6.00416 )
					if( ma30 <= 5.98031 )
						if( ma80_colorInt <= 3.5 )
							if( ma90 <= 3.82024 )
								if( ma05_colorInt <= 2.5 )
									ret := 0.717742 // buy
								if( ma05_colorInt > 2.5 )
									ret := 0.290493
							if( ma90 > 3.82024 )
								if( ma30 <= 3.84781 )
									ret := -0.189691
								if( ma30 > 3.84781 )
									ret := 0.122718
						if( ma80_colorInt > 3.5 )
							if( ma15 <= 3.74377 )
								if( ma15 <= 3.7238 )
									ret := -0.454545
								if( ma15 > 3.7238 )
									ret := -0.965517 // sell
							if( ma15 > 3.74377 )
								if( ma70_colorInt <= 1.5 )
									ret := -0.448718
								if( ma70_colorInt > 1.5 )
									ret := 0.023833
					if( ma30 > 5.98031 )
						if( ma15 <= 5.94388 )
							ret := -0.833333 // sell
						if( ma15 > 5.94388 )
							if( ma05 <= 5.98686 )
								if( ma60 <= 6.01357 )
									ret := 0.705882 // buy
								if( ma60 > 6.01357 )
									ret := -0.333333
							if( ma05 > 5.98686 )
								if( ma40 <= 6.00212 )
									ret := 0.942308 // buy
								if( ma40 > 6.00212 )
									ret := 0.636364
				if( ma40 > 6.00416 )
					if( ma40 <= 6.06855 )
						if( ma80_colorInt <= 3.5 )
							if( ma65 <= 6.06329 )
								if( ma90 <= 6.06747 )
									ret := -0.254545
								if( ma90 > 6.06747 )
									ret := 0.380952
							if( ma65 > 6.06329 )
								if( ma90 <= 6.09856 )
									ret := -0.781250 // sell
								if( ma90 > 6.09856 )
									ret := -0.371429
						if( ma80_colorInt > 3.5 )
							if( ma35 <= 6.03639 )
								ret := 0.363636
							if( ma35 > 6.03639 )
								ret := 0.818182 // buy
					if( ma40 > 6.06855 )
						if( ma20 <= 7.56471 )
							if( ma50_colorInt <= 1.5 )
								if( ma75_colorInt <= 2.5 )
									ret := -0.238494
								if( ma75_colorInt > 2.5 )
									ret := 0.578947
							if( ma50_colorInt > 1.5 )
								if( ma60 <= 7.54914 )
									ret := 0.066438
								if( ma60 > 7.54914 )
									ret := -0.288390
						if( ma20 > 7.56471 )
							if( ma05 <= 7.58781 )
								if( ma100 <= 7.48475 )
									ret := 1.000000 // buy
								if( ma100 > 7.48475 )
									ret := 0.372642
							if( ma05 > 7.58781 )
								if( ma05 <= 7.65405 )
									ret := -0.080189
								if( ma05 > 7.65405 )
									ret := 0.705882 // buy
			if( ma15_colorInt > 3.5 )
				if( ma85 <= 6.70763 )
					if( ma80 <= 3.73999 )
						if( ma45_colorInt <= 3.5 )
							if( ma20 <= 3.69722 )
								ret := 0.076923
							if( ma20 > 3.69722 )
								if( ma20 <= 3.69869 )
									ret := 1.000000 // buy
								if( ma20 > 3.69869 )
									ret := 0.214286
						if( ma45_colorInt > 3.5 )
							if( ma15 <= 3.70297 )
								if( ma15 <= 3.69579 )
									ret := 0.888889 // buy
								if( ma15 > 3.69579 )
									ret := 0.916667 // buy
							if( ma15 > 3.70297 )
								if( ma100 <= 3.72383 )
									ret := 0.000000
								if( ma100 > 3.72383 )
									ret := 0.842105 // buy
					if( ma80 > 3.73999 )
						if( ma30 <= 6.25061 )
							if( ma90 <= 6.26298 )
								if( ma15 <= 4.79235 )
									ret := -0.126656
								if( ma15 > 4.79235 )
									ret := -0.025939
							if( ma90 > 6.26298 )
								if( ma90 <= 6.40217 )
									ret := 0.588235
								if( ma90 > 6.40217 )
									ret := -0.307692
						if( ma30 > 6.25061 )
							if( ma35_colorInt <= 3.5 )
								if( ma75 <= 6.53499 )
									ret := -0.891304 // sell
								if( ma75 > 6.53499 )
									ret := -0.500000
							if( ma35_colorInt > 3.5 )
								if( ma30 <= 6.27081 )
									ret := -0.813559 // sell
								if( ma30 > 6.27081 )
									ret := -0.130952
				if( ma85 > 6.70763 )
					if( ma05 <= 6.78273 )
						if( ma35 <= 6.78362 )
							if( ma90 <= 6.73278 )
								if( ma70 <= 6.71591 )
									ret := 0.615385
								if( ma70 > 6.71591 )
									ret := 1.000000 // buy
							if( ma90 > 6.73278 )
								if( ma70_colorInt <= 3.5 )
									ret := 0.365385
								if( ma70_colorInt > 3.5 )
									ret := -0.642857
						if( ma35 > 6.78362 )
							if( ma40 <= 6.80213 )
								ret := 0.761905 // buy
							if( ma40 > 6.80213 )
								ret := 1.000000 // buy
					if( ma05 > 6.78273 )
						if( ma50 <= 7.06573 )
							if( ma80 <= 6.88241 )
								if( ma75 <= 6.83698 )
									ret := -0.842105 // sell
								if( ma75 > 6.83698 )
									ret := 0.520833
							if( ma80 > 6.88241 )
								if( ma90 <= 7.02322 )
									ret := -0.911111 // sell
								if( ma90 > 7.02322 )
									ret := -0.450000
						if( ma50 > 7.06573 )
							if( ma10_colorInt <= 2 )
								if( ma55 <= 7.31648 )
									ret := 0.645161
								if( ma55 > 7.31648 )
									ret := 0.279412
							if( ma10_colorInt > 2 )
								if( ma35 <= 7.55478 )
									ret := 0.094092
								if( ma35 > 7.55478 )
									ret := 0.439189
		if( ma75 > 7.62334 )
			if( ma30 <= 14.8693 )
				if( ma05 <= 14.7191 )
					if( ma20 <= 7.70799 )
						if( ma10_colorInt <= 1.5 )
							if( ma50 <= 7.64579 )
								ret := -0.421053
							if( ma50 > 7.64579 )
								if( ma10 <= 7.71115 )
									ret := -0.611111
								if( ma10 > 7.71115 )
									ret := -1.000000 // sell
						if( ma10_colorInt > 1.5 )
							if( ma100 <= 7.70409 )
								if( ma30 <= 7.56256 )
									ret := 0.465753
								if( ma30 > 7.56256 )
									ret := -0.095070
							if( ma100 > 7.70409 )
								if( ma30 <= 7.61506 )
									ret := -0.833333 // sell
								if( ma30 > 7.61506 )
									ret := -0.260188
					if( ma20 > 7.70799 )
						if( ma45 <= 10.9497 )
							if( ma25 <= 10.9144 )
								if( ma05 <= 10.8419 )
									ret := -0.001306
								if( ma05 > 10.8419 )
									ret := -0.285106
							if( ma25 > 10.9144 )
								if( ma75_colorInt <= 2.5 )
									ret := 0.581818
								if( ma75_colorInt > 2.5 )
									ret := -0.028571
						if( ma45 > 10.9497 )
							if( ma85 <= 11.0781 )
								if( ma10 <= 10.9308 )
									ret := -0.319588
								if( ma10 > 10.9308 )
									ret := -0.733577 // sell
							if( ma85 > 11.0781 )
								if( ma60 <= 11.0772 )
									ret := 0.756757 // buy
								if( ma60 > 11.0772 )
									ret := -0.077194
				if( ma05 > 14.7191 )
					if( ma20 <= 14.8309 )
						if( ma05 <= 14.7587 )
							if( ma55 <= 14.8793 )
								ret := -0.230769
							if( ma55 > 14.8793 )
								ret := 1.000000 // buy
						if( ma05 > 14.7587 )
							if( ma65 <= 14.9068 )
								ret := 1.000000 // buy
							if( ma65 > 14.9068 )
								if( ma10 <= 14.7827 )
									ret := 0.750000 // buy
								if( ma10 > 14.7827 )
									ret := 0.916667 // buy
					if( ma20 > 14.8309 )
						if( ma60 <= 14.9067 )
							if( ma15 <= 14.8539 )
								ret := 0.307692
							if( ma15 > 14.8539 )
								ret := 1.000000 // buy
						if( ma60 > 14.9067 )
							ret := -0.166667
			if( ma30 > 14.8693 )
				if( ma80_colorInt <= 2.5 )
					if( ma65 <= 15.336 )
						if( ma25 <= 15.2064 )
							if( ma50 <= 15.2309 )
								if( ma45_colorInt <= 2.5 )
									ret := -0.306122
								if( ma45_colorInt > 2.5 )
									ret := 0.585366
							if( ma50 > 15.2309 )
								if( ma75 <= 15.2451 )
									ret := -1.000000 // sell
								if( ma75 > 15.2451 )
									ret := -0.444444
						if( ma25 > 15.2064 )
							if( ma45 <= 15.3439 )
								if( ma10 <= 15.1504 )
									ret := 1.000000 // buy
								if( ma10 > 15.1504 )
									ret := 0.760000 // buy
							if( ma45 > 15.3439 )
								ret := 0.200000
					if( ma65 > 15.336 )
						if( ma55 <= 15.4089 )
							if( ma90_colorInt <= 1.5 )
								if( ma30 <= 15.3926 )
									ret := -0.900000 // sell
								if( ma30 > 15.3926 )
									ret := -0.666667
							if( ma90_colorInt > 1.5 )
								ret := -1.000000 // sell
						if( ma55 > 15.4089 )
							if( ma45 <= 15.7015 )
								if( ma80 <= 15.4823 )
									ret := -0.423077
								if( ma80 > 15.4823 )
									ret := 0.772727 // buy
							if( ma45 > 15.7015 )
								ret := -1.000000 // sell
				if( ma80_colorInt > 2.5 )
					if( ma50 <= 15.2091 )
						if( ma05_colorInt <= 1.5 )
							if( ma25 <= 14.9707 )
								ret := -0.916667 // sell
							if( ma25 > 14.9707 )
								ret := -1.000000 // sell
						if( ma05_colorInt > 1.5 )
							if( ma100 <= 15.039 )
								if( ma90 <= 14.9672 )
									ret := -0.687500
								if( ma90 > 14.9672 )
									ret := -0.982143 // sell
							if( ma100 > 15.039 )
								if( ma75 <= 15.1261 )
									ret := -0.051282
								if( ma75 > 15.1261 )
									ret := -0.836735 // sell
					if( ma50 > 15.2091 )
						if( ma55 <= 15.4541 )
							if( ma85 <= 15.4312 )
								ret := 0.000000
							if( ma85 > 15.4312 )
								ret := 0.916667 // buy
						if( ma55 > 15.4541 )
							ret := -0.733333 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Madrid_Moving_Average_Ribbon 
//@version=5
//indicator "Madrid Moving Average Ribbon", shorttitle="Madrid Ribbon", overlay=true)


PHI     = (1 + math.sqrt(5)) / 2
PI      = 104348 / 33215

BULL    = 1
BEAR    = -1
NONE    = 0

GRN01 = color.rgb(124, 252, 0)
GRN02 = color.rgb(50, 205, 50)
GRN03 = color.rgb(34, 139, 34)
GRN04 = color.rgb(0, 100, 0)
GRN05 = color.rgb(0, 128, 0)
GRN06 = color.rgb(9, 53, 7)
RED01 = color.rgb(255, 69, 0)
RED02 = color.rgb(255, 0, 0)
RED03 = color.rgb(178, 34, 34)
RED04 = color.rgb(139, 0, 0)
RED05 = color.rgb(128, 0, 0)
RED06 = color.rgb(51, 13, 6)

// Define other v3 Style Colors
AQUA    = color.rgb(0, 255, 255)
BLACK   = color.rgb(0, 0, 0)
BLUE    = color.rgb(0, 0, 255)
FUCHSIA = color.rgb(255, 0, 255)
GRAY    = color.rgb(128, 128, 128)
GREEN   = color.rgb(0, 128, 0)
LIME    = color.rgb(0, 255, 0)
MAROON  = color.rgb(128, 0, 0)
NAVY    = color.rgb(0, 0, 128)
OLIVE   = color.rgb(128, 128, 0)
ORANGE  = color.rgb(255, 127, 0)
PURPLE  = color.rgb(128, 0, 128)
RUBI    = color.rgb(255, 0, 0)
SILVER  = color.rgb(192, 192, 192)
TEAL    = color.rgb(0, 128, 128)
YELLOW  = color.rgb(255, 255, 0)
WHITE   = color.rgb(255, 255, 255)


// ──────────[ Moving Average Color ]
maColor(_ma, _maRef) =>
    diffMA = ta.change(_ma)
    diffMA >= 0 and _ma > _maRef ? LIME : diffMA < 0 and _ma > _maRef ? MAROON : diffMA <= 0 and _ma < _maRef ? RUBI : diffMA >= 0 and _ma < _maRef ? GREEN : GRAY

// Function to calculate the integer representing the color condition
ma_color_int(ma, ma_ref) =>
    diff_ma = ta.change(ma)
    diff_ma >= 0 and ma > ma_ref ? 1 : diff_ma < 0 and ma > ma_ref ? 2 : diff_ma <= 0 and ma < ma_ref ? 3 : diff_ma >= 0 and ma < ma_ref ? 4 : 5


_10   = input.bool(false, '───────────[ Madrid Ribbon]───────────' )
i_exp = input(true, title="Exponential MA")

// ────────────────────[ Processing ]
src = close

ma05  = i_exp ? ta.ema(src, 5) : ta.sma(src, 5)
ma10  = i_exp ? ta.ema(src, 10) : ta.sma(src, 10)
ma15  = i_exp ? ta.ema(src, 15) : ta.sma(src, 15)
ma20  = i_exp ? ta.ema(src, 20) : ta.sma(src, 20)
ma25  = i_exp ? ta.ema(src, 25) : ta.sma(src, 25)
ma30  = i_exp ? ta.ema(src, 30) : ta.sma(src, 30)
ma35  = i_exp ? ta.ema(src, 35) : ta.sma(src, 35)
ma40  = i_exp ? ta.ema(src, 40) : ta.sma(src, 40)
ma45  = i_exp ? ta.ema(src, 45) : ta.sma(src, 45)
ma50  = i_exp ? ta.ema(src, 50) : ta.sma(src, 50)
ma55  = i_exp ? ta.ema(src, 55) : ta.sma(src, 55)
ma60  = i_exp ? ta.ema(src, 60) : ta.sma(src, 60)
ma65  = i_exp ? ta.ema(src, 65) : ta.sma(src, 65)
ma70  = i_exp ? ta.ema(src, 70) : ta.sma(src, 70)
ma75  = i_exp ? ta.ema(src, 75) : ta.sma(src, 75)
ma80  = i_exp ? ta.ema(src, 80) : ta.sma(src, 80)
ma85  = i_exp ? ta.ema(src, 85) : ta.sma(src, 85)
ma90  = i_exp ? ta.ema(src, 90) : ta.sma(src, 90)
ma100 = i_exp ? ta.ema(src, 100) : ta.sma(src, 100)

// ────────────────────[ Plot ]
plot(ma05, color=maColor(ma05, ma100), title="MMA05", linewidth=3)
plot(ma10, color=maColor(ma10, ma100), title="MMA10", linewidth=1)
plot(ma15, color=maColor(ma15, ma100), title="MMA15", linewidth=1)
plot(ma20, color=maColor(ma20, ma100), title="MMA20", linewidth=1)
plot(ma25, color=maColor(ma25, ma100), title="MMA25", linewidth=1)
plot(ma30, color=maColor(ma30, ma100), title="MMA30", linewidth=1)
plot(ma35, color=maColor(ma35, ma100), title="MMA35", linewidth=1)
plot(ma40, color=maColor(ma40, ma100), title="MMA40", linewidth=1)
plot(ma45, color=maColor(ma45, ma100), title="MMA45", linewidth=1)
plot(ma50, color=maColor(ma50, ma100), title="MMA50", linewidth=1)
plot(ma55, color=maColor(ma55, ma100), title="MMA55", linewidth=1)
plot(ma60, color=maColor(ma60, ma100), title="MMA60", linewidth=1)
plot(ma65, color=maColor(ma65, ma100), title="MMA65", linewidth=1)
plot(ma70, color=maColor(ma70, ma100), title="MMA70", linewidth=1)
plot(ma75, color=maColor(ma75, ma100), title="MMA75", linewidth=1)
plot(ma80, color=maColor(ma80, ma100), title="MMA80", linewidth=1)
plot(ma85, color=maColor(ma85, ma100), title="MMA85", linewidth=1)
plot(ma90, color=maColor(ma90, ma100), title="MMA90", linewidth=3)



//Calculate colors based on the moving averages compared to ma100
ma05_colorInt = ma_color_int(ma05, ma100)
ma10_colorInt = ma_color_int(ma10, ma100)
ma15_colorInt = ma_color_int(ma15, ma100)
ma20_colorInt = ma_color_int(ma20, ma100)
ma25_colorInt = ma_color_int(ma25, ma100)
ma30_colorInt = ma_color_int(ma30, ma100)
ma35_colorInt = ma_color_int(ma35, ma100)
ma40_colorInt = ma_color_int(ma40, ma100)
ma45_colorInt = ma_color_int(ma45, ma100)
ma50_colorInt = ma_color_int(ma50, ma100)
ma55_colorInt = ma_color_int(ma55, ma100)
ma60_colorInt = ma_color_int(ma60, ma100)
ma65_colorInt = ma_color_int(ma65, ma100)
ma70_colorInt = ma_color_int(ma70, ma100)
ma75_colorInt = ma_color_int(ma75, ma100)
ma80_colorInt = ma_color_int(ma80, ma100)
ma85_colorInt = ma_color_int(ma85, ma100)
ma90_colorInt = ma_color_int(ma90, ma100)


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
float op_operation = decision_tree_0_NIO_5Min_30cbf9ad(ma15, ma70_colorInt, ma75_colorInt, ma70, ma40_colorInt, ma80_colorInt, ma20, ma20_colorInt, ma60, ma50, ma65_colorInt, ma45, ma55, ma05_colorInt, ma35_colorInt, ma10_colorInt, ma30, ma25_colorInt, ma100, ma65, ma85, ma80, ma60_colorInt, ma85_colorInt, ma90, ma90_colorInt, ma25, ma40, ma50_colorInt, ma35, ma30_colorInt, ma45_colorInt, ma05, ma75, ma55_colorInt, ma10, ma15_colorInt)

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


