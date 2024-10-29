//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: GOOG_1Min_1MAD_0c3476e8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GOOG_1Min_1MAD_0c3476e8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GOOG_1Min_0c3476e8(ma15, ma70_colorInt, ma75_colorInt, ma70, ma40_colorInt, ma80_colorInt, ma20, ma20_colorInt, ma60, ma50, ma65_colorInt, ma45, ma55, ma05_colorInt, ma35_colorInt, ma10_colorInt, ma30, ma25_colorInt, ma100, ma65, ma85, ma80, ma60_colorInt, ma85_colorInt, ma90, ma90_colorInt, ma25, ma40, ma50_colorInt, ma35, ma30_colorInt, ma45_colorInt, ma05, ma75, ma55_colorInt, ma10, ma15_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ma30_colorInt <= 1.5 )
		if( ma65 <= 163.973 )
			if( ma05 <= 163.517 )
				if( ma05 <= 163.299 )
					if( ma05 <= 162.254 )
						if( ma15 <= 162.098 )
							if( ma05_colorInt <= 1.5 )
								if( ma85 <= 161.893 )
									ret := -0.010088
								if( ma85 > 161.893 )
									ret := 0.875000 // buy
							if( ma05_colorInt > 1.5 )
								if( ma35 <= 161.841 )
									ret := 0.113569
								if( ma35 > 161.841 )
									ret := -0.714286 // sell
						if( ma15 > 162.098 )
							if( ma50 <= 162.048 )
								if( ma65_colorInt <= 2.5 )
									ret := -0.964286 // sell
								if( ma65_colorInt > 2.5 )
									ret := -0.600000
							if( ma50 > 162.048 )
								if( ma15 <= 162.184 )
									ret := 0.250000
								if( ma15 > 162.184 )
									ret := -0.600000
					if( ma05 > 162.254 )
						if( ma80 <= 161.745 )
							if( ma25 <= 162.021 )
								if( ma45 <= 160.886 )
									ret := 0.111111
								if( ma45 > 160.886 )
									ret := 0.860759 // buy
							if( ma25 > 162.021 )
								if( ma35 <= 162.208 )
									ret := 0.104167
								if( ma35 > 162.208 )
									ret := 0.736842 // buy
						if( ma80 > 161.745 )
							if( ma75 <= 162.055 )
								if( ma05 <= 162.747 )
									ret := -0.163934
								if( ma05 > 162.747 )
									ret := -0.692308
							if( ma75 > 162.055 )
								if( ma100 <= 161.987 )
									ret := 0.814815 // buy
								if( ma100 > 161.987 )
									ret := 0.093809
				if( ma05 > 163.299 )
					if( ma90 <= 161.674 )
						if( ma100 <= 161.506 )
							if( ma05 <= 163.32 )
								ret := -0.750000 // sell
							if( ma05 > 163.32 )
								ret := -1.000000 // sell
						if( ma100 > 161.506 )
							ret := -0.400000
					if( ma90 > 161.674 )
						if( ma20 <= 163.097 )
							if( ma80 <= 161.901 )
								ret := 0.250000
							if( ma80 > 161.901 )
								if( ma05 <= 163.463 )
									ret := 1.000000 // buy
								if( ma05 > 163.463 )
									ret := 0.750000 // buy
						if( ma20 > 163.097 )
							if( ma05 <= 163.433 )
								if( ma45 <= 163.288 )
									ret := -0.445378
								if( ma45 > 163.288 )
									ret := 0.250000
							if( ma05 > 163.433 )
								if( ma100 <= 162.833 )
									ret := -0.571429
								if( ma100 > 162.833 )
									ret := 0.184211
			if( ma05 > 163.517 )
				if( ma15 <= 163.716 )
					if( ma30 <= 163.151 )
						if( ma40 <= 162.822 )
							if( ma15 <= 163.368 )
								ret := 0.600000
							if( ma15 > 163.368 )
								ret := 1.000000 // buy
						if( ma40 > 162.822 )
							ret := 1.000000 // buy
					if( ma30 > 163.151 )
						if( ma80 <= 162.345 )
							ret := -1.000000 // sell
						if( ma80 > 162.345 )
							if( ma100 <= 163.321 )
								if( ma80 <= 163.229 )
									ret := 0.310345
								if( ma80 > 163.229 )
									ret := 0.777778 // buy
							if( ma100 > 163.321 )
								if( ma35 <= 163.648 )
									ret := 0.141176
								if( ma35 > 163.648 )
									ret := 0.785714 // buy
				if( ma15 > 163.716 )
					if( ma30 <= 163.798 )
						if( ma05 <= 163.822 )
							if( ma100 <= 163.461 )
								if( ma10_colorInt <= 1.5 )
									ret := 0.888889 // buy
								if( ma10_colorInt > 1.5 )
									ret := 0.200000
							if( ma100 > 163.461 )
								if( ma50 <= 163.667 )
									ret := -0.111111
								if( ma50 > 163.667 )
									ret := 0.500000
						if( ma05 > 163.822 )
							if( ma10 <= 164.666 )
								if( ma15 <= 163.832 )
									ret := -0.174603
								if( ma15 > 163.832 )
									ret := -0.545455
							if( ma10 > 164.666 )
								ret := 1.000000 // buy
					if( ma30 > 163.798 )
						if( ma20 <= 164.774 )
							if( ma85 <= 163.666 )
								if( ma65 <= 163.572 )
									ret := 0.223684
								if( ma65 > 163.572 )
									ret := 0.611842
							if( ma85 > 163.666 )
								if( ma20 <= 164.267 )
									ret := -0.043290
								if( ma20 > 164.267 )
									ret := 0.714286 // buy
						if( ma20 > 164.774 )
							ret := -1.000000 // sell
		if( ma65 > 163.973 )
			if( ma10 <= 165.88 )
				if( ma05 <= 165.767 )
					if( ma35 <= 164.175 )
						if( ma05 <= 164.255 )
							if( ma90 <= 164.052 )
								if( ma45 <= 164.125 )
									ret := -0.228261
								if( ma45 > 164.125 )
									ret := -1.000000 // sell
							if( ma90 > 164.052 )
								if( ma15 <= 164.173 )
									ret := -0.028571
								if( ma15 > 164.173 )
									ret := 0.181818
						if( ma05 > 164.255 )
							if( ma90 <= 164.135 )
								if( ma15 <= 164.294 )
									ret := -0.709677 // sell
								if( ma15 > 164.294 )
									ret := 0.250000
							if( ma90 > 164.135 )
								ret := 0.500000
					if( ma35 > 164.175 )
						if( ma90 <= 164.406 )
							if( ma45 <= 164.475 )
								if( ma40_colorInt <= 3 )
									ret := -0.136170
								if( ma40_colorInt > 3 )
									ret := 0.600000
							if( ma45 > 164.475 )
								if( ma10 <= 164.616 )
									ret := -0.289474
								if( ma10 > 164.616 )
									ret := 0.466667
						if( ma90 > 164.406 )
							if( ma90 <= 165.143 )
								if( ma100 <= 165.009 )
									ret := -0.141988
								if( ma100 > 165.009 )
									ret := -0.403846
							if( ma90 > 165.143 )
								if( ma05 <= 165.504 )
									ret := 0.309091
								if( ma05 > 165.504 )
									ret := -0.101449
				if( ma05 > 165.767 )
					if( ma90 <= 164.505 )
						ret := 0.857143 // buy
					if( ma90 > 164.505 )
						if( ma80 <= 165.543 )
							if( ma25 <= 165.517 )
								if( ma05_colorInt <= 1.5 )
									ret := -0.945946 // sell
								if( ma05_colorInt > 1.5 )
									ret := -0.500000
							if( ma25 > 165.517 )
								if( ma25 <= 165.605 )
									ret := -0.068966
								if( ma25 > 165.605 )
									ret := -0.669643
						if( ma80 > 165.543 )
							if( ma15_colorInt <= 1.5 )
								if( ma45 <= 165.726 )
									ret := 0.000000
								if( ma45 > 165.726 )
									ret := -0.344828
							if( ma15_colorInt > 1.5 )
								if( ma100 <= 165.725 )
									ret := -0.909091 // sell
								if( ma100 > 165.725 )
									ret := -0.250000
			if( ma10 > 165.88 )
				if( ma15 <= 166.506 )
					if( ma15 <= 166.108 )
						if( ma65 <= 165.771 )
							if( ma05 <= 166.217 )
								if( ma40 <= 165.633 )
									ret := 0.809524 // buy
								if( ma40 > 165.633 )
									ret := 0.328125
							if( ma05 > 166.217 )
								if( ma85 <= 164.739 )
									ret := -1.000000 // sell
								if( ma85 > 164.739 )
									ret := -0.500000
						if( ma65 > 165.771 )
							if( ma50 <= 165.848 )
								if( ma45 <= 165.839 )
									ret := -0.444444
								if( ma45 > 165.839 )
									ret := -0.913043 // sell
							if( ma50 > 165.848 )
								if( ma05_colorInt <= 1.5 )
									ret := -0.358491
								if( ma05_colorInt > 1.5 )
									ret := 0.130435
					if( ma15 > 166.108 )
						if( ma100 <= 166.008 )
							if( ma50 <= 165.959 )
								if( ma30 <= 166.154 )
									ret := 0.666667
								if( ma30 > 166.154 )
									ret := -0.454545
							if( ma50 > 165.959 )
								if( ma65 <= 165.928 )
									ret := 0.818182 // buy
								if( ma65 > 165.928 )
									ret := 0.981818 // buy
						if( ma100 > 166.008 )
							if( ma75_colorInt <= 2.5 )
								if( ma40 <= 166.464 )
									ret := 0.008403
								if( ma40 > 166.464 )
									ret := 0.923077 // buy
							if( ma75_colorInt > 2.5 )
								if( ma05 <= 166.526 )
									ret := 0.733333 // buy
								if( ma05 > 166.526 )
									ret := -0.333333
				if( ma15 > 166.506 )
					if( ma90 <= 166.399 )
						if( ma10_colorInt <= 1.5 )
							if( ma60 <= 166.131 )
								if( ma45 <= 165.923 )
									ret := -1.000000 // sell
								if( ma45 > 165.923 )
									ret := -0.265306
							if( ma60 > 166.131 )
								if( ma05 <= 167.034 )
									ret := -0.630631
								if( ma05 > 167.034 )
									ret := -0.934783 // sell
						if( ma10_colorInt > 1.5 )
							if( ma85 <= 165.907 )
								if( ma60 <= 165.778 )
									ret := -1.000000 // sell
								if( ma60 > 165.778 )
									ret := 0.782609 // buy
							if( ma85 > 165.907 )
								if( ma85 <= 166.221 )
									ret := -0.653846
								if( ma85 > 166.221 )
									ret := 0.184211
					if( ma90 > 166.399 )
						if( ma15_colorInt <= 3.5 )
							if( ma35_colorInt <= 3.5 )
								if( ma90 <= 167.736 )
									ret := 0.065264
								if( ma90 > 167.736 )
									ret := -0.004412
							if( ma35_colorInt > 3.5 )
								if( ma65 <= 166.658 )
									ret := -0.850000 // sell
								if( ma65 > 166.658 )
									ret := -0.147222
						if( ma15_colorInt > 3.5 )
							if( ma75 <= 185.262 )
								if( ma85 <= 167.93 )
									ret := 0.083333
								if( ma85 > 167.93 )
									ret := -0.461538
							if( ma75 > 185.262 )
								if( ma20_colorInt <= 2.5 )
									ret := 0.500000
								if( ma20_colorInt > 2.5 )
									ret := 0.125000
	if( ma30_colorInt > 1.5 )
		if( ma05_colorInt <= 3.5 )
			if( ma10_colorInt <= 1.5 )
				if( ma25 <= 177.199 )
					if( ma20_colorInt <= 2.5 )
						if( ma55 <= 171.749 )
							if( ma05 <= 167.032 )
								if( ma70_colorInt <= 1.5 )
									ret := -0.211838
								if( ma70_colorInt > 1.5 )
									ret := 0.100000
							if( ma05 > 167.032 )
								if( ma30 <= 166.812 )
									ret := -0.863636 // sell
								if( ma30 > 166.812 )
									ret := -0.214674
						if( ma55 > 171.749 )
							if( ma40 <= 172.881 )
								if( ma35_colorInt <= 1.5 )
									ret := -0.500000
								if( ma35_colorInt > 1.5 )
									ret := 0.823529 // buy
							if( ma40 > 172.881 )
								if( ma80 <= 174.06 )
									ret := -0.098592
								if( ma80 > 174.06 )
									ret := 0.237410
					if( ma20_colorInt > 2.5 )
						if( ma90 <= 160.59 )
							if( ma05 <= 160.88 )
								if( ma80 <= 158.052 )
									ret := 0.192000
								if( ma80 > 158.052 )
									ret := -0.157480
							if( ma05 > 160.88 )
								ret := -1.000000 // sell
						if( ma90 > 160.59 )
							if( ma65 <= 161.094 )
								if( ma25 <= 160.896 )
									ret := 1.000000 // buy
								if( ma25 > 160.896 )
									ret := 0.750000 // buy
							if( ma65 > 161.094 )
								if( ma85 <= 161.48 )
									ret := -0.705882 // sell
								if( ma85 > 161.48 )
									ret := 0.162791
				if( ma25 > 177.199 )
					if( ma80 <= 177.187 )
						if( ma65 <= 177.269 )
							ret := -0.600000
						if( ma65 > 177.269 )
							ret := -1.000000 // sell
					if( ma80 > 177.187 )
						if( ma65_colorInt <= 3.5 )
							if( ma60_colorInt <= 1.5 )
								if( ma90 <= 190.64 )
									ret := -0.150000
								if( ma90 > 190.64 )
									ret := 0.454545
							if( ma60_colorInt > 1.5 )
								if( ma15_colorInt <= 1.5 )
									ret := 0.448276
								if( ma15_colorInt > 1.5 )
									ret := 0.137931
						if( ma65_colorInt > 3.5 )
							if( ma05 <= 185.56 )
								if( ma90 <= 179.463 )
									ret := -0.321739
								if( ma90 > 179.463 )
									ret := -0.024631
							if( ma05 > 185.56 )
								if( ma90 <= 185.479 )
									ret := -1.000000 // sell
								if( ma90 > 185.479 )
									ret := -0.352601
			if( ma10_colorInt > 1.5 )
				if( ma75 <= 149.181 )
					if( ma85 <= 149.119 )
						ret := 0.500000
					if( ma85 > 149.119 )
						ret := 1.000000 // buy
				if( ma75 > 149.181 )
					if( ma05 <= 187.95 )
						if( ma100 <= 153.521 )
							if( ma65 <= 150.497 )
								if( ma50 <= 149.316 )
									ret := -0.682927
								if( ma50 > 149.316 )
									ret := 0.331002
							if( ma65 > 150.497 )
								if( ma25 <= 150.853 )
									ret := -0.572093
								if( ma25 > 150.853 )
									ret := -0.052991
						if( ma100 > 153.521 )
							if( ma85 <= 155.444 )
								if( ma65_colorInt <= 1.5 )
									ret := 0.054545
								if( ma65_colorInt > 1.5 )
									ret := 0.451417
							if( ma85 > 155.444 )
								if( ma30 <= 155.689 )
									ret := -0.545455
								if( ma30 > 155.689 )
									ret := 0.117301
					if( ma05 > 187.95 )
						if( ma30 <= 189.504 )
							if( ma100 <= 189.011 )
								if( ma90 <= 188.497 )
									ret := -0.349650
								if( ma90 > 188.497 )
									ret := 0.209790
							if( ma100 > 189.011 )
								if( ma60 <= 189.243 )
									ret := -0.925926 // sell
								if( ma60 > 189.243 )
									ret := -0.566667
						if( ma30 > 189.504 )
							if( ma30 <= 190.955 )
								if( ma65 <= 190.151 )
									ret := 0.833333 // buy
								if( ma65 > 190.151 )
									ret := 0.202381
							if( ma30 > 190.955 )
								if( ma35 <= 191.291 )
									ret := -0.341085
								if( ma35 > 191.291 )
									ret := -0.006211
		if( ma05_colorInt > 3.5 )
			if( ma10 <= 149.481 )
				if( ma55 <= 150.059 )
					if( ma80 <= 149.545 )
						if( ma90_colorInt <= 3.5 )
							if( ma35_colorInt <= 3.5 )
								ret := 0.500000
							if( ma35_colorInt > 3.5 )
								if( ma30 <= 148.706 )
									ret := 0.750000 // buy
								if( ma30 > 148.706 )
									ret := 1.000000 // buy
						if( ma90_colorInt > 3.5 )
							if( ma15 <= 149.088 )
								ret := -0.750000 // sell
							if( ma15 > 149.088 )
								ret := 1.000000 // buy
					if( ma80 > 149.545 )
						if( ma85 <= 149.591 )
							ret := -0.833333 // sell
						if( ma85 > 149.591 )
							if( ma80 <= 149.6 )
								ret := 0.714286 // buy
							if( ma80 > 149.6 )
								if( ma100 <= 149.702 )
									ret := 0.500000
								if( ma100 > 149.702 )
									ret := -0.285714
				if( ma55 > 150.059 )
					if( ma90 <= 150.776 )
						ret := 1.000000 // buy
					if( ma90 > 150.776 )
						ret := 0.750000 // buy
			if( ma10 > 149.481 )
				if( ma35_colorInt <= 3.5 )
					if( ma20 <= 156.663 )
						if( ma90 <= 156.599 )
							if( ma80 <= 156.43 )
								if( ma55_colorInt <= 1.5 )
									ret := 0.642857
								if( ma55_colorInt > 1.5 )
									ret := -0.146982
							if( ma80 > 156.43 )
								if( ma65 <= 156.402 )
									ret := 0.956522 // buy
								if( ma65 > 156.402 )
									ret := 0.000000
						if( ma90 > 156.599 )
							if( ma10 <= 156.148 )
								if( ma15 <= 156.194 )
									ret := -0.689655
								if( ma15 > 156.194 )
									ret := 0.000000
							if( ma10 > 156.148 )
								if( ma85 <= 156.8 )
									ret := -0.714286 // sell
								if( ma85 > 156.8 )
									ret := -1.000000 // sell
					if( ma20 > 156.663 )
						if( ma100 <= 165.253 )
							if( ma65 <= 164.788 )
								if( ma80 <= 163.917 )
									ret := 0.116057
								if( ma80 > 163.917 )
									ret := -0.102845
							if( ma65 > 164.788 )
								if( ma50 <= 164.798 )
									ret := 0.772727 // buy
								if( ma50 > 164.798 )
									ret := 0.349693
						if( ma100 > 165.253 )
							if( ma05 <= 165.13 )
								if( ma80 <= 165.693 )
									ret := -0.630000
								if( ma80 > 165.693 )
									ret := -0.250000
							if( ma05 > 165.13 )
								if( ma45_colorInt <= 2.5 )
									ret := -0.069930
								if( ma45_colorInt > 2.5 )
									ret := 0.054130
				if( ma35_colorInt > 3.5 )
					if( ma05 <= 166.179 )
						if( ma65 <= 165.619 )
							if( ma60 <= 164.248 )
								if( ma05 <= 161.491 )
									ret := -0.038197
								if( ma05 > 161.491 )
									ret := 0.182561
							if( ma60 > 164.248 )
								if( ma15 <= 164.369 )
									ret := -0.767857 // sell
								if( ma15 > 164.369 )
									ret := -0.138047
						if( ma65 > 165.619 )
							if( ma100 <= 165.93 )
								if( ma80_colorInt <= 2.5 )
									ret := 0.000000
								if( ma80_colorInt > 2.5 )
									ret := 0.906250 // buy
							if( ma100 > 165.93 )
								if( ma65_colorInt <= 3.5 )
									ret := 0.471154
								if( ma65_colorInt > 3.5 )
									ret := 0.000000
					if( ma05 > 166.179 )
						if( ma70 <= 167.233 )
							if( ma25 <= 166.88 )
								if( ma40 <= 166.887 )
									ret := -0.186813
								if( ma40 > 166.887 )
									ret := 1.000000 // buy
							if( ma25 > 166.88 )
								if( ma05 <= 167.142 )
									ret := -0.867925 // sell
								if( ma05 > 167.142 )
									ret := -0.375000
						if( ma70 > 167.233 )
							if( ma85 <= 167.854 )
								if( ma20 <= 167.693 )
									ret := 0.107570
								if( ma20 > 167.693 )
									ret := 0.744681 // buy
							if( ma85 > 167.854 )
								if( ma100 <= 168.894 )
									ret := -0.311284
								if( ma100 > 168.894 )
									ret := -0.071543
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_GOOG_1Min_0c3476e8(ma15, ma70_colorInt, ma75_colorInt, ma70, ma40_colorInt, ma80_colorInt, ma20, ma20_colorInt, ma60, ma50, ma65_colorInt, ma45, ma55, ma05_colorInt, ma35_colorInt, ma10_colorInt, ma30, ma25_colorInt, ma100, ma65, ma85, ma80, ma60_colorInt, ma85_colorInt, ma90, ma90_colorInt, ma25, ma40, ma50_colorInt, ma35, ma30_colorInt, ma45_colorInt, ma05, ma75, ma55_colorInt, ma10, ma15_colorInt)

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


