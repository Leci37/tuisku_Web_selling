//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: TRXUSDT_15Min_1MAD_b1f33ccc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_15Min_1MAD_b1f33ccc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_15Min_b1f33ccc(ma05, ma50_colorInt, ma90, ma35_colorInt, ma90_colorInt, ma55_colorInt, ma20, ma15_colorInt, ma40_colorInt, ma45_colorInt, ma65_colorInt, ma75_colorInt, ma35, ma30, ma60, ma75, ma05_colorInt, ma45, ma40, ma30_colorInt, ma25, ma100, ma50, ma70_colorInt, ma10_colorInt, ma20_colorInt, ma60_colorInt, ma25_colorInt, ma10, ma15, ma80, ma65, ma85_colorInt, ma55, ma70, ma85, ma80_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ma25 <= 0.061966 )
		if( ma10_colorInt <= 2.5 )
			if( ma10 <= 0.06204 )
				if( ma05_colorInt <= 2.5 )
					if( ma55 <= 0.050266 )
						if( ma05 <= 0.050093 )
							if( ma100 <= 0.049872 )
								if( ma20_colorInt <= 3.5 )
									ret := 0.071429
								if( ma20_colorInt > 3.5 )
									ret := -0.500000
							if( ma100 > 0.049872 )
								ret := 1.000000 // buy
						if( ma05 > 0.050093 )
							if( ma25_colorInt <= 1.5 )
								if( ma10 <= 0.050564 )
									ret := 0.166667
								if( ma10 > 0.050564 )
									ret := -0.700000 // sell
							if( ma25_colorInt > 1.5 )
								if( ma20 <= 0.049813 )
									ret := -0.750000 // sell
								if( ma20 > 0.049813 )
									ret := -1.000000 // sell
					if( ma55 > 0.050266 )
						if( ma45 <= 0.050638 )
							if( ma05 <= 0.050812 )
								if( ma100 <= 0.050556 )
									ret := 0.242424
								if( ma100 > 0.050556 )
									ret := -0.666667
							if( ma05 > 0.050812 )
								if( ma40 <= 0.050492 )
									ret := -0.200000
								if( ma40 > 0.050492 )
									ret := 0.900000 // buy
						if( ma45 > 0.050638 )
							if( ma75 <= 0.050808 )
								if( ma25_colorInt <= 1.5 )
									ret := -0.529412
								if( ma25_colorInt > 1.5 )
									ret := 0.277778
							if( ma75 > 0.050808 )
								if( ma20 <= 0.051125 )
									ret := 0.857143 // buy
								if( ma20 > 0.051125 )
									ret := 0.022809
				if( ma05_colorInt > 2.5 )
					if( ma35 <= 0.058842 )
						if( ma20 <= 0.056046 )
							if( ma05 <= 0.054128 )
								if( ma65 <= 0.053884 )
									ret := 0.629032
								if( ma65 > 0.053884 )
									ret := 1.000000 // buy
							if( ma05 > 0.054128 )
								if( ma15 <= 0.055133 )
									ret := 0.051282
								if( ma15 > 0.055133 )
									ret := 0.631579
						if( ma20 > 0.056046 )
							if( ma05 <= 0.057256 )
								ret := 1.000000 // buy
							if( ma05 > 0.057256 )
								if( ma20 <= 0.058144 )
									ret := 0.750000 // buy
								if( ma20 > 0.058144 )
									ret := 1.000000 // buy
					if( ma35 > 0.058842 )
						if( ma100 <= 0.06028 )
							if( ma90_colorInt <= 2.5 )
								if( ma05 <= 0.060143 )
									ret := -0.900000 // sell
								if( ma05 > 0.060143 )
									ret := -0.500000
							if( ma90_colorInt > 2.5 )
								ret := 0.000000
						if( ma100 > 0.06028 )
							if( ma15_colorInt <= 2.5 )
								if( ma100 <= 0.061599 )
									ret := 0.280488
								if( ma100 > 0.061599 )
									ret := -0.181818
							if( ma15_colorInt > 2.5 )
								ret := -0.500000
			if( ma10 > 0.06204 )
				if( ma75 <= 0.061246 )
					if( ma55 <= 0.059407 )
						ret := 1.000000 // buy
					if( ma55 > 0.059407 )
						if( ma40 <= 0.061153 )
							if( ma30 <= 0.061129 )
								ret := -0.571429
							if( ma30 > 0.061129 )
								ret := 1.000000 // buy
						if( ma40 > 0.061153 )
							if( ma35 <= 0.061468 )
								ret := -1.000000 // sell
							if( ma35 > 0.061468 )
								if( ma10 <= 0.062269 )
									ret := 0.250000
								if( ma10 > 0.062269 )
									ret := -0.500000
				if( ma75 > 0.061246 )
					if( ma65_colorInt <= 2.5 )
						if( ma05 <= 0.062157 )
							if( ma05_colorInt <= 1.5 )
								ret := 0.500000
							if( ma05_colorInt > 1.5 )
								ret := 1.000000 // buy
						if( ma05 > 0.062157 )
							if( ma45 <= 0.061742 )
								ret := 1.000000 // buy
							if( ma45 > 0.061742 )
								if( ma30 <= 0.06185 )
									ret := 0.750000 // buy
								if( ma30 > 0.06185 )
									ret := 1.000000 // buy
					if( ma65_colorInt > 2.5 )
						if( ma05 <= 0.062274 )
							if( ma85 <= 0.061893 )
								ret := -0.166667
							if( ma85 > 0.061893 )
								ret := 1.000000 // buy
						if( ma05 > 0.062274 )
							ret := 1.000000 // buy
		if( ma10_colorInt > 2.5 )
			if( ma10_colorInt <= 3.5 )
				if( ma25 <= 0.058921 )
					if( ma100 <= 0.060509 )
						if( ma85 <= 0.054506 )
							if( ma50 <= 0.049852 )
								if( ma80 <= 0.049777 )
									ret := 1.000000 // buy
								if( ma80 > 0.049777 )
									ret := 0.638889
							if( ma50 > 0.049852 )
								if( ma75 <= 0.050158 )
									ret := -0.826087 // sell
								if( ma75 > 0.050158 )
									ret := 0.283940
						if( ma85 > 0.054506 )
							if( ma10 <= 0.053458 )
								if( ma50 <= 0.053634 )
									ret := 1.000000 // buy
								if( ma50 > 0.053634 )
									ret := -0.930233 // sell
							if( ma10 > 0.053458 )
								if( ma65 <= 0.058872 )
									ret := 0.061611
								if( ma65 > 0.058872 )
									ret := 0.708333 // buy
					if( ma100 > 0.060509 )
						if( ma75 <= 0.060503 )
							if( ma10 <= 0.058044 )
								ret := -1.000000 // sell
							if( ma10 > 0.058044 )
								if( ma80 <= 0.060514 )
									ret := -0.500000
								if( ma80 > 0.060514 )
									ret := -1.000000 // sell
						if( ma75 > 0.060503 )
							if( ma25 <= 0.058541 )
								ret := 0.000000
							if( ma25 > 0.058541 )
								ret := -0.833333 // sell
				if( ma25 > 0.058921 )
					if( ma90 <= 0.061002 )
						if( ma100 <= 0.060341 )
							if( ma05 <= 0.060073 )
								if( ma75 <= 0.060094 )
									ret := 0.332432
								if( ma75 > 0.060094 )
									ret := 0.648276
							if( ma05 > 0.060073 )
								if( ma55_colorInt <= 3.5 )
									ret := -0.325000
								if( ma55_colorInt > 3.5 )
									ret := 0.583333
						if( ma100 > 0.060341 )
							if( ma05_colorInt <= 3.5 )
								if( ma05 <= 0.060878 )
									ret := 0.738007 // buy
								if( ma05 > 0.060878 )
									ret := -0.500000
							if( ma05_colorInt > 3.5 )
								if( ma100 <= 0.060525 )
									ret := 1.000000 // buy
								if( ma100 > 0.060525 )
									ret := 0.090909
					if( ma90 > 0.061002 )
						if( ma15 <= 0.061074 )
							if( ma45 <= 0.061859 )
								if( ma85 <= 0.062176 )
									ret := 0.009868
								if( ma85 > 0.062176 )
									ret := -0.857143 // sell
							if( ma45 > 0.061859 )
								if( ma05 <= 0.058536 )
									ret := -0.111111
								if( ma05 > 0.058536 )
									ret := 1.000000 // buy
						if( ma15 > 0.061074 )
							if( ma30 <= 0.061973 )
								if( ma45 <= 0.061949 )
									ret := 0.310873
								if( ma45 > 0.061949 )
									ret := 0.596273
							if( ma30 > 0.061973 )
								if( ma90 <= 0.062813 )
									ret := 0.000000
								if( ma90 > 0.062813 )
									ret := -0.888889 // sell
			if( ma10_colorInt > 3.5 )
				if( ma05 <= 0.049793 )
					if( ma05 <= 0.049599 )
						if( ma60 <= 0.049596 )
							ret := 1.000000 // buy
						if( ma60 > 0.049596 )
							if( ma80 <= 0.050281 )
								if( ma15_colorInt <= 3.5 )
									ret := -1.000000 // sell
								if( ma15_colorInt > 3.5 )
									ret := 0.076923
							if( ma80 > 0.050281 )
								if( ma05 <= 0.049491 )
									ret := 1.000000 // buy
								if( ma05 > 0.049491 )
									ret := 0.250000
					if( ma05 > 0.049599 )
						if( ma85 <= 0.050645 )
							if( ma05 <= 0.049648 )
								ret := 0.750000 // buy
							if( ma05 > 0.049648 )
								if( ma05 <= 0.049773 )
									ret := 1.000000 // buy
								if( ma05 > 0.049773 )
									ret := 0.800000 // buy
						if( ma85 > 0.050645 )
							ret := 0.500000
				if( ma05 > 0.049793 )
					if( ma10 <= 0.060286 )
						if( ma100 <= 0.061098 )
							if( ma05 <= 0.060149 )
								if( ma45_colorInt <= 3.5 )
									ret := 0.032691
								if( ma45_colorInt > 3.5 )
									ret := 0.196815
							if( ma05 > 0.060149 )
								if( ma70 <= 0.060625 )
									ret := -0.563380
								if( ma70 > 0.060625 )
									ret := 0.666667
						if( ma100 > 0.061098 )
							if( ma40 <= 0.061354 )
								if( ma05 <= 0.060134 )
									ret := -0.867925 // sell
								if( ma05 > 0.060134 )
									ret := 0.000000
							if( ma40 > 0.061354 )
								if( ma70 <= 0.063184 )
									ret := 1.000000 // buy
								if( ma70 > 0.063184 )
									ret := -0.545455
					if( ma10 > 0.060286 )
						if( ma50 <= 0.06225 )
							if( ma20 <= 0.060982 )
								if( ma40 <= 0.060856 )
									ret := 0.253012
								if( ma40 > 0.060856 )
									ret := 0.603604
							if( ma20 > 0.060982 )
								if( ma35 <= 0.061756 )
									ret := 0.082117
								if( ma35 > 0.061756 )
									ret := 0.341346
						if( ma50 > 0.06225 )
							if( ma20 <= 0.061783 )
								if( ma30 <= 0.061829 )
									ret := -0.666667
								if( ma30 > 0.061829 )
									ret := 0.250000
							if( ma20 > 0.061783 )
								ret := -1.000000 // sell
	if( ma25 > 0.061966 )
		if( ma85 <= 0.062567 )
			if( ma10_colorInt <= 1.5 )
				if( ma30 <= 0.064132 )
					if( ma100 <= 0.061789 )
						if( ma100 <= 0.061724 )
							if( ma05 <= 0.062526 )
								if( ma55 <= 0.061967 )
									ret := -0.285714
								if( ma55 > 0.061967 )
									ret := 0.833333 // buy
							if( ma05 > 0.062526 )
								if( ma10 <= 0.062621 )
									ret := -0.888889 // sell
								if( ma10 > 0.062621 )
									ret := -0.328571
						if( ma100 > 0.061724 )
							if( ma15 <= 0.062138 )
								ret := -0.250000
							if( ma15 > 0.062138 )
								if( ma10 <= 0.062433 )
									ret := -0.636364
								if( ma10 > 0.062433 )
									ret := -0.935484 // sell
					if( ma100 > 0.061789 )
						if( ma20 <= 0.062207 )
							if( ma10 <= 0.062285 )
								if( ma50_colorInt <= 2.5 )
									ret := 0.210526
								if( ma50_colorInt > 2.5 )
									ret := -0.437500
							if( ma10 > 0.062285 )
								if( ma70_colorInt <= 2.5 )
									ret := 1.000000 // buy
								if( ma70_colorInt > 2.5 )
									ret := 0.700000 // buy
						if( ma20 > 0.062207 )
							if( ma20 <= 0.062683 )
								if( ma15 <= 0.062595 )
									ret := -0.257271
								if( ma15 > 0.062595 )
									ret := -0.584795
							if( ma20 > 0.062683 )
								if( ma05 <= 0.063024 )
									ret := 0.317460
								if( ma05 > 0.063024 )
									ret := -0.286585
				if( ma30 > 0.064132 )
					ret := 1.000000 // buy
			if( ma10_colorInt > 1.5 )
				if( ma40 <= 0.061873 )
					if( ma20_colorInt <= 1.5 )
						if( ma35 <= 0.061967 )
							ret := 1.000000 // buy
						if( ma35 > 0.061967 )
							ret := 0.400000
					if( ma20_colorInt > 1.5 )
						ret := -0.500000
				if( ma40 > 0.061873 )
					if( ma85 <= 0.061365 )
						if( ma45_colorInt <= 1.5 )
							if( ma05 <= 0.062578 )
								ret := -0.800000 // sell
							if( ma05 > 0.062578 )
								ret := -1.000000 // sell
						if( ma45_colorInt > 1.5 )
							if( ma15 <= 0.061988 )
								ret := -1.000000 // sell
							if( ma15 > 0.061988 )
								if( ma15 <= 0.062706 )
									ret := 0.250000
								if( ma15 > 0.062706 )
									ret := 0.750000 // buy
					if( ma85 > 0.061365 )
						if( ma80 <= 0.06221 )
							if( ma90_colorInt <= 3.5 )
								if( ma85 <= 0.062179 )
									ret := 0.170483
								if( ma85 > 0.062179 )
									ret := 0.542857
							if( ma90_colorInt > 3.5 )
								if( ma05_colorInt <= 1.5 )
									ret := -0.727273 // sell
								if( ma05_colorInt > 1.5 )
									ret := 0.103448
						if( ma80 > 0.06221 )
							if( ma100 <= 0.062096 )
								if( ma80 <= 0.062242 )
									ret := -0.200000
								if( ma80 > 0.062242 )
									ret := -0.928571 // sell
							if( ma100 > 0.062096 )
								if( ma15 <= 0.062007 )
									ret := -0.386667
								if( ma15 > 0.062007 )
									ret := 0.015610
		if( ma85 > 0.062567 )
			if( ma05 <= 0.063435 )
				if( ma60 <= 0.063587 )
					if( ma15_colorInt <= 1.5 )
						if( ma90 <= 0.062574 )
							if( ma40 <= 0.062804 )
								if( ma70 <= 0.062601 )
									ret := 0.500000
								if( ma70 > 0.062601 )
									ret := 1.000000 // buy
							if( ma40 > 0.062804 )
								ret := 0.200000
						if( ma90 > 0.062574 )
							if( ma70 <= 0.062851 )
								if( ma55 <= 0.062818 )
									ret := -0.092308
								if( ma55 > 0.062818 )
									ret := -0.625000
							if( ma70 > 0.062851 )
								if( ma80 <= 0.0629 )
									ret := 0.475610
								if( ma80 > 0.0629 )
									ret := -0.194175
					if( ma15_colorInt > 1.5 )
						if( ma05 <= 0.063194 )
							if( ma50 <= 0.063373 )
								if( ma100 <= 0.0638 )
									ret := 0.142073
								if( ma100 > 0.0638 )
									ret := -0.823529 // sell
							if( ma50 > 0.063373 )
								if( ma70 <= 0.063642 )
									ret := -0.428571
								if( ma70 > 0.063642 )
									ret := 1.000000 // buy
						if( ma05 > 0.063194 )
							if( ma40 <= 0.063425 )
								if( ma90 <= 0.063359 )
									ret := 0.403315
								if( ma90 > 0.063359 )
									ret := 0.704762 // buy
							if( ma40 > 0.063425 )
								if( ma90 <= 0.06348 )
									ret := -0.347826
								if( ma90 > 0.06348 )
									ret := 0.062500
				if( ma60 > 0.063587 )
					if( ma10 <= 0.060911 )
						if( ma30 <= 0.062931 )
							ret := 0.000000
						if( ma30 > 0.062931 )
							if( ma55 <= 0.064471 )
								ret := -1.000000 // sell
							if( ma55 > 0.064471 )
								ret := -0.750000 // sell
					if( ma10 > 0.060911 )
						if( ma75 <= 0.065621 )
							if( ma80 <= 0.065034 )
								if( ma25 <= 0.063414 )
									ret := 0.614130
								if( ma25 > 0.063414 )
									ret := 0.307210
							if( ma80 > 0.065034 )
								if( ma10 <= 0.061783 )
									ret := 1.000000 // buy
								if( ma10 > 0.061783 )
									ret := -0.947368 // sell
						if( ma75 > 0.065621 )
							if( ma40 <= 0.065409 )
								ret := 1.000000 // buy
							if( ma40 > 0.065409 )
								if( ma05_colorInt <= 3.5 )
									ret := 0.875000 // buy
								if( ma05_colorInt > 3.5 )
									ret := -0.600000
			if( ma05 > 0.063435 )
				if( ma45_colorInt <= 3.5 )
					if( ma05 <= 0.066029 )
						if( ma05_colorInt <= 2.5 )
							if( ma30 <= 0.065225 )
								if( ma35 <= 0.065035 )
									ret := -0.022183
								if( ma35 > 0.065035 )
									ret := -0.317597
							if( ma30 > 0.065225 )
								if( ma90_colorInt <= 1.5 )
									ret := 0.338617
								if( ma90_colorInt > 1.5 )
									ret := -0.266409
						if( ma05_colorInt > 2.5 )
							if( ma05_colorInt <= 3.5 )
								if( ma15 <= 0.063749 )
									ret := -0.072115
								if( ma15 > 0.063749 )
									ret := 0.270248
							if( ma05_colorInt > 3.5 )
								if( ma90 <= 0.068699 )
									ret := 0.047735
								if( ma90 > 0.068699 )
									ret := -1.000000 // sell
					if( ma05 > 0.066029 )
						if( ma65 <= 0.066699 )
							if( ma15 <= 0.066471 )
								if( ma90 <= 0.066713 )
									ret := -0.023617
								if( ma90 > 0.066713 )
									ret := -0.641509
							if( ma15 > 0.066471 )
								if( ma90 <= 0.065038 )
									ret := -0.873418 // sell
								if( ma90 > 0.065038 )
									ret := -0.194015
						if( ma65 > 0.066699 )
							if( ma80 <= 0.066721 )
								if( ma10 <= 0.067321 )
									ret := 0.400000
								if( ma10 > 0.067321 )
									ret := 0.872727 // buy
							if( ma80 > 0.066721 )
								if( ma05 <= 0.08074 )
									ret := 0.051143
								if( ma05 > 0.08074 )
									ret := 0.011414
				if( ma45_colorInt > 3.5 )
					if( ma20_colorInt <= 2.5 )
						if( ma05 <= 0.064495 )
							if( ma55 <= 0.063567 )
								if( ma05 <= 0.063809 )
									ret := -0.210526
								if( ma05 > 0.063809 )
									ret := 0.666667
							if( ma55 > 0.063567 )
								if( ma100 <= 0.063679 )
									ret := -1.000000 // sell
								if( ma100 > 0.063679 )
									ret := -0.525641
						if( ma05 > 0.064495 )
							if( ma10 <= 0.076233 )
								if( ma75_colorInt <= 2.5 )
									ret := -0.265306
								if( ma75_colorInt > 2.5 )
									ret := 0.154354
							if( ma10 > 0.076233 )
								if( ma50 <= 0.0759 )
									ret := -0.947368 // sell
								if( ma50 > 0.0759 )
									ret := -0.019817
					if( ma20_colorInt > 2.5 )
						if( ma15 <= 0.161854 )
							if( ma10 <= 0.066329 )
								if( ma90 <= 0.065376 )
									ret := 0.136536
								if( ma90 > 0.065376 )
									ret := -0.154459
							if( ma10 > 0.066329 )
								if( ma85 <= 0.069277 )
									ret := 0.260638
								if( ma85 > 0.069277 )
									ret := 0.104744
						if( ma15 > 0.161854 )
							if( ma05_colorInt <= 2.5 )
								if( ma20 <= 0.162255 )
									ret := -1.000000 // sell
								if( ma20 > 0.162255 )
									ret := -0.888889 // sell
							if( ma05_colorInt > 2.5 )
								ret := -0.142857
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_TRXUSDT_15Min_b1f33ccc(ma05, ma50_colorInt, ma90, ma35_colorInt, ma90_colorInt, ma55_colorInt, ma20, ma15_colorInt, ma40_colorInt, ma45_colorInt, ma65_colorInt, ma75_colorInt, ma35, ma30, ma60, ma75, ma05_colorInt, ma45, ma40, ma30_colorInt, ma25, ma100, ma50, ma70_colorInt, ma10_colorInt, ma20_colorInt, ma60_colorInt, ma25_colorInt, ma10, ma15, ma80, ma65, ma85_colorInt, ma55, ma70, ma85, ma80_colorInt)

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


