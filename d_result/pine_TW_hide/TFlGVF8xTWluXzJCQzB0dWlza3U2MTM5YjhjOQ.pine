//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Chaikin_Money_Flow
// ID_model: LYFT_1Min_2BC0_6139b8c9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_1Min_2BC0_6139b8c9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_1Min_6139b8c9(bearPower, bbm, bbp, bullPower, BBPower_Color, mf, ad_mf, ad)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.009391 )
		if( bbm <= 0.002709 )
			if( bullPower <= -0.017965 )
				if( mf <= -0.347842 )
					if( ad <= 3062.69 )
						if( bbp <= -0.055182 )
							if( mf <= -0.362468 )
								if( ad_mf <= 0.63814 )
									ret := 0.644231
								if( ad_mf > 0.63814 )
									ret := 0.173913
							if( mf > -0.362468 )
								if( bullPower <= -0.034371 )
									ret := -0.500000
								if( bullPower > -0.034371 )
									ret := 1.000000 // buy
						if( bbp > -0.055182 )
							if( ad_mf <= 0.592036 )
								if( mf <= -0.4264 )
									ret := -0.130435
								if( mf > -0.4264 )
									ret := 0.428571
							if( ad_mf > 0.592036 )
								if( mf <= -0.617756 )
									ret := 0.259259
								if( mf > -0.617756 )
									ret := 1.000000 // buy
					if( ad > 3062.69 )
						ret := -0.500000
				if( mf > -0.347842 )
					if( bbp <= -0.549739 )
						ret := -1.000000 // sell
					if( bbp > -0.549739 )
						if( bbm <= 0.001499 )
							if( bbp <= -0.114172 )
								if( bbp <= -0.136259 )
									ret := 0.664804
								if( bbp > -0.136259 )
									ret := 0.811321 // buy
							if( bbp > -0.114172 )
								if( bearPower <= -0.050355 )
									ret := 0.358491
								if( bearPower > -0.050355 )
									ret := 0.619250
						if( bbm > 0.001499 )
							if( mf <= -0.130849 )
								if( bullPower <= -0.020992 )
									ret := -0.466667
								if( bullPower > -0.020992 )
									ret := 0.600000
							if( mf > -0.130849 )
								if( ad_mf <= 0.045921 )
									ret := 0.117647
								if( ad_mf > 0.045921 )
									ret := 1.000000 // buy
			if( bullPower > -0.017965 )
				if( bearPower <= -0.009508 )
					if( bearPower <= -0.01235 )
						if( mf <= 0.629244 )
							if( ad_mf <= -0.529209 )
								if( ad_mf <= -0.564134 )
									ret := 0.230769
								if( ad_mf > -0.564134 )
									ret := -1.000000 // sell
							if( ad_mf > -0.529209 )
								if( bearPower <= -0.017872 )
									ret := -0.047619
								if( bearPower > -0.017872 )
									ret := 0.364162
						if( mf > 0.629244 )
							if( bbp <= -0.030719 )
								ret := 1.000000 // buy
							if( bbp > -0.030719 )
								if( bbp <= -0.027635 )
									ret := 0.500000
								if( bbp > -0.027635 )
									ret := 0.833333 // buy
					if( bearPower > -0.01235 )
						if( bbm <= 0.001152 )
							if( bullPower <= -0.011577 )
								if( mf <= -0.234739 )
									ret := 0.785714 // buy
								if( mf > -0.234739 )
									ret := 0.526316
							if( bullPower > -0.011577 )
								if( bearPower <= -0.009578 )
									ret := 0.408284
								if( bearPower > -0.009578 )
									ret := 0.818182 // buy
						if( bbm > 0.001152 )
							if( ad_mf <= -0.0978 )
								ret := 0.750000 // buy
							if( ad_mf > -0.0978 )
								ret := 1.000000 // buy
				if( bearPower > -0.009508 )
					if( mf <= -0.293644 )
						if( bearPower <= -0.007494 )
							if( mf <= -0.324751 )
								if( ad_mf <= 0.698547 )
									ret := 0.133333
								if( ad_mf > 0.698547 )
									ret := 0.500000
							if( mf > -0.324751 )
								ret := 1.000000 // buy
						if( bearPower > -0.007494 )
							if( ad_mf <= 0.787455 )
								if( mf <= -0.434575 )
									ret := 0.290323
								if( mf > -0.434575 )
									ret := 0.557377
							if( ad_mf > 0.787455 )
								ret := 1.000000 // buy
					if( mf > -0.293644 )
						if( mf <= -0.184691 )
							if( mf <= -0.23093 )
								if( mf <= -0.235636 )
									ret := 0.076923
								if( mf > -0.235636 )
									ret := 0.750000 // buy
							if( mf > -0.23093 )
								if( bearPower <= -0.007028 )
									ret := -0.500000
								if( bearPower > -0.007028 )
									ret := 0.000000
						if( mf > -0.184691 )
							if( bullPower <= -0.004821 )
								if( ad_mf <= -0.359352 )
									ret := 0.070312
								if( ad_mf > -0.359352 )
									ret := 0.281250
							if( bullPower > -0.004821 )
								if( bearPower <= -0.005798 )
									ret := 1.000000 // buy
								if( bearPower > -0.005798 )
									ret := 0.454545
		if( bbm > 0.002709 )
			if( ad_mf <= -169.148 )
				if( ad_mf <= -1522.58 )
					if( ad <= -259655 )
						if( bullPower <= 0.033114 )
							if( bbm <= 0.021293 )
								ret := 0.000000
							if( bbm > 0.021293 )
								if( ad <= -422788 )
									ret := 1.000000 // buy
								if( ad > -422788 )
									ret := 0.718750 // buy
						if( bullPower > 0.033114 )
							ret := -0.750000 // sell
					if( ad > -259655 )
						if( bearPower <= -0.31737 )
							if( bbp <= -0.500331 )
								ret := 1.000000 // buy
							if( bbp > -0.500331 )
								if( bbm <= 0.338683 )
									ret := 0.000000
								if( bbm > 0.338683 )
									ret := 1.000000 // buy
						if( bearPower > -0.31737 )
							if( bbp <= -0.273487 )
								if( ad_mf <= -2716.13 )
									ret := -0.321101
								if( ad_mf > -2716.13 )
									ret := 1.000000 // buy
							if( bbp > -0.273487 )
								if( ad <= -180605 )
									ret := -0.320755
								if( ad > -180605 )
									ret := 0.116686
				if( ad_mf > -1522.58 )
					if( bbp <= -0.385342 )
						ret := -1.000000 // sell
					if( bbp > -0.385342 )
						if( bullPower <= -0.001567 )
							if( bearPower <= -0.042828 )
								if( bbm <= 0.0824 )
									ret := 0.668246
								if( bbm > 0.0824 )
									ret := -0.666667
							if( bearPower > -0.042828 )
								if( ad_mf <= -817.039 )
									ret := 0.448133
								if( ad_mf > -817.039 )
									ret := 0.216346
						if( bullPower > -0.001567 )
							if( bbp <= -0.023774 )
								if( ad_mf <= -680.909 )
									ret := 0.872727 // buy
								if( ad_mf > -680.909 )
									ret := 0.548387
							if( bbp > -0.023774 )
								if( bbp <= -0.021803 )
									ret := 0.090909
								if( bbp > -0.021803 )
									ret := 0.573643
			if( ad_mf > -169.148 )
				if( bullPower <= 0.017225 )
					if( bbm <= 0.146192 )
						if( ad <= 16123.9 )
							if( bearPower <= -0.061843 )
								if( ad_mf <= 0.298871 )
									ret := 0.429688
								if( ad_mf > 0.298871 )
									ret := 0.161765
							if( bearPower > -0.061843 )
								if( ad_mf <= -124.264 )
									ret := -0.500000
								if( ad_mf > -124.264 )
									ret := 0.036820
						if( ad > 16123.9 )
							if( bearPower <= -0.071193 )
								if( bbp <= -0.075988 )
									ret := -0.173611
								if( bbp > -0.075988 )
									ret := -0.866667 // sell
							if( bearPower > -0.071193 )
								if( ad_mf <= 85551.5 )
									ret := 0.002001
								if( ad_mf > 85551.5 )
									ret := 0.314433
					if( bbm > 0.146192 )
						if( bbp <= -0.32456 )
							if( ad_mf <= 26178.8 )
								if( ad <= 4745.9 )
									ret := 1.000000 // buy
								if( ad > 4745.9 )
									ret := 0.500000
							if( ad_mf > 26178.8 )
								ret := 1.000000 // buy
						if( bbp > -0.32456 )
							if( bearPower <= -0.239617 )
								ret := -0.666667
							if( bearPower > -0.239617 )
								if( bullPower <= 0.003728 )
									ret := 0.627907
								if( bullPower > 0.003728 )
									ret := -0.222222
				if( bullPower > 0.017225 )
					if( mf <= 0.090804 )
						if( mf <= -0.084359 )
							if( bearPower <= -0.056943 )
								if( bbp <= -0.03226 )
									ret := -0.578947
								if( bbp > -0.03226 )
									ret := -1.000000 // sell
							if( bearPower > -0.056943 )
								if( mf <= -0.211187 )
									ret := 0.333333
								if( mf > -0.211187 )
									ret := -0.486486
						if( mf > -0.084359 )
							if( ad <= 614.292 )
								ret := -1.000000 // sell
							if( ad > 614.292 )
								if( bbm <= 0.06537 )
									ret := -0.085714
								if( bbm > 0.06537 )
									ret := 0.338462
					if( mf > 0.090804 )
						if( ad <= 129160 )
							if( bbm <= 0.077979 )
								if( bullPower <= 0.028299 )
									ret := -0.473684
								if( bullPower > 0.028299 )
									ret := 0.600000
							if( bbm > 0.077979 )
								if( bbm <= 0.395 )
									ret := -0.830986 // sell
								if( bbm > 0.395 )
									ret := 0.250000
						if( ad > 129160 )
							if( bbp <= -0.025749 )
								if( bbm <= 0.140499 )
									ret := 0.000000
								if( bbm > 0.140499 )
									ret := 1.000000 // buy
							if( bbp > -0.025749 )
								if( ad_mf <= 373360 )
									ret := 0.250000
								if( ad_mf > 373360 )
									ret := -0.833333 // sell
	if( bbp > -0.009391 )
		if( bearPower <= 0.011401 )
			if( ad_mf <= 4.2e-05 )
				if( ad_mf <= -723979 )
					if( bbp <= 0.036608 )
						ret := 0.500000
					if( bbp > 0.036608 )
						ret := 1.000000 // buy
				if( ad_mf > -723979 )
					if( bbm <= 0.035108 )
						if( bbp <= 0.018581 )
							if( bearPower <= 0.003034 )
								if( BBPower_Color <= 0.5 )
									ret := 0.081437
								if( BBPower_Color > 0.5 )
									ret := 0.027051
							if( bearPower > 0.003034 )
								if( bbp <= 0.010301 )
									ret := 0.324042
								if( bbp > 0.010301 )
									ret := 0.123384
						if( bbp > 0.018581 )
							if( ad_mf <= -0.188268 )
								if( ad <= -33896.5 )
									ret := 0.147766
								if( ad > -33896.5 )
									ret := 0.018563
							if( ad_mf > -0.188268 )
								if( bbp <= 0.033422 )
									ret := -0.046512
								if( bbp > 0.033422 )
									ret := -0.653846
					if( bbm > 0.035108 )
						if( ad_mf <= -9191.63 )
							if( bbp <= 0.07292 )
								if( bbp <= 0.02177 )
									ret := -0.039846
								if( bbp > 0.02177 )
									ret := 0.169014
							if( bbp > 0.07292 )
								if( mf <= -0.109361 )
									ret := 0.214286
								if( mf > -0.109361 )
									ret := -0.483871
						if( ad_mf > -9191.63 )
							if( bbp <= 0.078729 )
								if( BBPower_Color <= 0.5 )
									ret := 0.495098
								if( BBPower_Color > 0.5 )
									ret := 0.262295
							if( bbp > 0.078729 )
								if( bbm <= 0.118613 )
									ret := 0.935484 // buy
								if( bbm > 0.118613 )
									ret := 0.407407
			if( ad_mf > 4.2e-05 )
				if( bearPower <= -0.036902 )
					if( ad <= 124511 )
						if( mf <= 0.397765 )
							if( bbm <= 0.12536 )
								if( mf <= -0.108258 )
									ret := -0.214286
								if( mf > -0.108258 )
									ret := -0.621622
							if( bbm > 0.12536 )
								if( bullPower <= 0.130806 )
									ret := -0.828571 // sell
								if( bullPower > 0.130806 )
									ret := -1.000000 // sell
						if( mf > 0.397765 )
							if( bbp <= 0.067554 )
								if( bullPower <= 0.056049 )
									ret := 0.142857
								if( bullPower > 0.056049 )
									ret := -0.666667
							if( bbp > 0.067554 )
								ret := 0.750000 // buy
					if( ad > 124511 )
						if( bearPower <= -0.122692 )
							ret := -1.000000 // sell
						if( bearPower > -0.122692 )
							if( BBPower_Color <= 0.5 )
								if( bbp <= 0.013198 )
									ret := 0.000000
								if( bbp > 0.013198 )
									ret := 0.733333 // buy
							if( BBPower_Color > 0.5 )
								if( bbp <= 0.087867 )
									ret := -0.777778 // sell
								if( bbp > 0.087867 )
									ret := 0.571429
				if( bearPower > -0.036902 )
					if( ad <= 628189 )
						if( ad_mf <= 40327.3 )
							if( bbm <= 0.045122 )
								if( bullPower <= 0.05346 )
									ret := -0.010252
								if( bullPower > 0.05346 )
									ret := 0.818182 // buy
							if( bbm > 0.045122 )
								if( ad <= 1719.74 )
									ret := -0.626506
								if( ad > 1719.74 )
									ret := -0.131894
						if( ad_mf > 40327.3 )
							if( ad_mf <= 40594.1 )
								if( bearPower <= -0.005245 )
									ret := 0.333333
								if( bearPower > -0.005245 )
									ret := 1.000000 // buy
							if( ad_mf > 40594.1 )
								if( mf <= 0.365764 )
									ret := 0.120152
								if( mf > 0.365764 )
									ret := -0.184874
					if( ad > 628189 )
						if( bbp <= 0.004339 )
							ret := -0.500000
						if( bbp > 0.004339 )
							ret := -1.000000 // sell
		if( bearPower > 0.011401 )
			if( ad <= 20219.5 )
				if( bbm <= 1.4e-05 )
					if( bullPower <= 0.024075 )
						if( ad_mf <= -0.038093 )
							if( mf <= 0.079617 )
								if( bbp <= 0.027004 )
									ret := -0.272727
								if( bbp > 0.027004 )
									ret := -0.697674
							if( mf > 0.079617 )
								if( ad_mf <= -0.107031 )
									ret := -0.294964
								if( ad_mf > -0.107031 )
									ret := 0.023810
						if( ad_mf > -0.038093 )
							if( mf <= -0.67265 )
								if( mf <= -0.726715 )
									ret := -0.222222
								if( mf > -0.726715 )
									ret := -0.937500 // sell
							if( mf > -0.67265 )
								if( ad_mf <= 0.298444 )
									ret := -0.157360
								if( ad_mf > 0.298444 )
									ret := 0.174699
					if( bullPower > 0.024075 )
						if( ad_mf <= 0.259682 )
							if( mf <= 0.76137 )
								if( mf <= 0.316949 )
									ret := -0.419118
								if( mf > 0.316949 )
									ret := -0.260377
							if( mf > 0.76137 )
								if( bbp <= 0.072159 )
									ret := -0.250000
								if( bbp > 0.072159 )
									ret := -1.000000 // sell
						if( ad_mf > 0.259682 )
							if( bullPower <= 0.041677 )
								if( ad_mf <= 0.295169 )
									ret := -0.920000 // sell
								if( ad_mf > 0.295169 )
									ret := -0.371429
							if( bullPower > 0.041677 )
								if( bbp <= 0.157708 )
									ret := -0.712329 // sell
								if( bbp > 0.157708 )
									ret := -1.000000 // sell
				if( bbm > 1.4e-05 )
					if( ad <= 14401.6 )
						if( mf <= -0.02273 )
							if( ad_mf <= 0.159915 )
								if( ad_mf <= -106634 )
									ret := 0.560976
								if( ad_mf > -106634 )
									ret := 0.073171
							if( ad_mf > 0.159915 )
								if( ad <= 4072.66 )
									ret := -0.288630
								if( ad > 4072.66 )
									ret := 0.120275
						if( mf > -0.02273 )
							if( ad <= 10932.7 )
								if( ad_mf <= 9050.54 )
									ret := -0.060875
								if( ad_mf > 9050.54 )
									ret := -0.401015
							if( ad > 10932.7 )
								if( bbp <= 0.148226 )
									ret := 0.146341
								if( bbp > 0.148226 )
									ret := 0.782609 // buy
					if( ad > 14401.6 )
						if( ad <= 20085.2 )
							if( bbm <= 0.045912 )
								if( ad <= 18276.6 )
									ret := -0.379009
								if( ad > 18276.6 )
									ret := -0.123077
							if( bbm > 0.045912 )
								if( bullPower <= 0.076047 )
									ret := 0.541667
								if( bullPower > 0.076047 )
									ret := -0.200000
						if( ad > 20085.2 )
							if( bbm <= 0.049555 )
								ret := -1.000000 // sell
							if( bbm > 0.049555 )
								ret := -0.750000 // sell
			if( ad > 20219.5 )
				if( ad <= 89373.4 )
					if( bbp <= 0.216649 )
						if( ad <= 22155.3 )
							if( ad <= 21373.4 )
								if( ad <= 21036.1 )
									ret := 0.254545
								if( ad > 21036.1 )
									ret := -0.428571
							if( ad > 21373.4 )
								if( bbm <= 0.018541 )
									ret := -0.538462
								if( bbm > 0.018541 )
									ret := 0.649351
						if( ad > 22155.3 )
							if( ad_mf <= 88116.6 )
								if( ad <= 85141 )
									ret := 0.046311
								if( ad > 85141 )
									ret := -0.611111
							if( ad_mf > 88116.6 )
								if( bbm <= 0.040315 )
									ret := 0.500000
								if( bbm > 0.040315 )
									ret := 1.000000 // buy
					if( bbp > 0.216649 )
						if( ad_mf <= 55584.1 )
							if( bullPower <= 0.473544 )
								if( bbm <= 0.085239 )
									ret := -0.428571
								if( bbm > 0.085239 )
									ret := -0.968750 // sell
							if( bullPower > 0.473544 )
								ret := 0.428571
						if( ad_mf > 55584.1 )
							if( bbp <= 0.237225 )
								ret := -1.000000 // sell
							if( bbp > 0.237225 )
								if( bearPower <= 0.119004 )
									ret := 0.250000
								if( bearPower > 0.119004 )
									ret := 1.000000 // buy
				if( ad > 89373.4 )
					if( ad_mf <= 123227 )
						if( bbp <= 0.129063 )
							if( bbm <= 0.050692 )
								if( ad <= 94230.5 )
									ret := 0.000000
								if( ad > 94230.5 )
									ret := -0.589744
							if( bbm > 0.050692 )
								if( bbm <= 0.067894 )
									ret := 0.666667
								if( bbm > 0.067894 )
									ret := -0.250000
						if( bbp > 0.129063 )
							if( bbp <= 0.155221 )
								if( bullPower <= 0.087632 )
									ret := -0.500000
								if( bullPower > 0.087632 )
									ret := -1.000000 // sell
							if( bbp > 0.155221 )
								if( bullPower <= 0.117093 )
									ret := 0.200000
								if( bullPower > 0.117093 )
									ret := -1.000000 // sell
					if( ad_mf > 123227 )
						if( ad_mf <= 490344 )
							if( mf <= 0.145759 )
								if( bbm <= 0.077043 )
									ret := 0.250000
								if( bbm > 0.077043 )
									ret := 1.000000 // buy
							if( mf > 0.145759 )
								if( bearPower <= 0.085551 )
									ret := -0.246032
								if( bearPower > 0.085551 )
									ret := 0.259259
						if( ad_mf > 490344 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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


//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf
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
float op_operation = decision_tree_0_LYFT_1Min_6139b8c9(bearPower, bbm, bbp, bullPower, BBPower_Color, mf, ad_mf, ad)

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


