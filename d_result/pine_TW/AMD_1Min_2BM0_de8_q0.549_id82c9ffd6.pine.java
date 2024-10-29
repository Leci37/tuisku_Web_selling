//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: AMD_1Min_2BM0_82c9ffd6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_1Min_2BM0_82c9ffd6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_1Min_82c9ffd6(bullPower, bbp, bearPower, bbm, BBPower_Color, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Positive_Money_Flow <= 3.46723e+07 )
		if( Positive_Money_Flow_Sum <= 2.50304e+06 )
			if( Negative_Money_Flow_Sum <= 5.31229e+06 )
				if( bullPower <= -0.249952 )
					if( Positive_Money_Flow_Sum <= 1.06496e+06 )
						if( Typical_Price <= 136.923 )
							if( Negative_Money_Flow_Sum <= 2.0747e+06 )
								ret := 0.916667 // buy
							if( Negative_Money_Flow_Sum > 2.0747e+06 )
								if( MFI_Low <= -0.978245 )
									ret := 0.022727
								if( MFI_Low > -0.978245 )
									ret := -0.952381 // sell
						if( Typical_Price > 136.923 )
							if( Raw_Money_Flow <= 98314.3 )
								if( MFI_High <= -56.0806 )
									ret := 0.363636
								if( MFI_High > -56.0806 )
									ret := 0.000000
							if( Raw_Money_Flow > 98314.3 )
								if( Negative_Money_Flow <= 111709 )
									ret := 0.355140
								if( Negative_Money_Flow > 111709 )
									ret := 0.608219
					if( Positive_Money_Flow_Sum > 1.06496e+06 )
						if( Negative_Money_Flow_Sum <= 835391 )
							ret := 0.947368 // buy
						if( Negative_Money_Flow_Sum > 835391 )
							if( Raw_Money_Flow <= 77986.2 )
								if( Negative_Money_Flow_Sum <= 1.34254e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 1.34254e+06 )
									ret := -0.428571
							if( Raw_Money_Flow > 77986.2 )
								if( Money_Flow_Ratio <= 0.283643 )
									ret := -0.688889
								if( Money_Flow_Ratio > 0.283643 )
									ret := 0.059770
				if( bullPower > -0.249952 )
					if( Raw_Money_Flow <= 104564 )
						if( Negative_Money_Flow_Sum <= 3.30375e+06 )
							if( Negative_Money_Flow_Sum <= 1.51358e+06 )
								if( bullPower <= 0.174993 )
									ret := 0.001940
								if( bullPower > 0.174993 )
									ret := -0.161859
							if( Negative_Money_Flow_Sum > 1.51358e+06 )
								if( Negative_Money_Flow_Sum <= 2.17118e+06 )
									ret := -0.159310
								if( Negative_Money_Flow_Sum > 2.17118e+06 )
									ret := -0.024123
						if( Negative_Money_Flow_Sum > 3.30375e+06 )
							if( bullPower <= -0.044413 )
								if( Money_Flow_Ratio <= 0.193899 )
									ret := 0.684211
								if( Money_Flow_Ratio > 0.193899 )
									ret := 0.147368
							if( bullPower > -0.044413 )
								if( Positive_Money_Flow <= 91935.5 )
									ret := 0.005181
								if( Positive_Money_Flow > 91935.5 )
									ret := 0.452381
					if( Raw_Money_Flow > 104564 )
						if( Negative_Money_Flow_Sum <= 4.58777e+06 )
							if( Negative_Money_Flow_Sum <= 2.65067e+06 )
								if( Negative_Money_Flow_Sum <= 2.43481e+06 )
									ret := 0.057081
								if( Negative_Money_Flow_Sum > 2.43481e+06 )
									ret := 0.284790
							if( Negative_Money_Flow_Sum > 2.65067e+06 )
								if( bullPower <= 0.495592 )
									ret := -0.034527
								if( bullPower > 0.495592 )
									ret := 0.821918 // buy
						if( Negative_Money_Flow_Sum > 4.58777e+06 )
							if( Negative_Money_Flow <= 258266 )
								if( MFI_Low <= 0.848982 )
									ret := 0.010753
								if( MFI_Low > 0.848982 )
									ret := -0.627273
							if( Negative_Money_Flow > 258266 )
								if( MFI_High <= -52.0639 )
									ret := -0.026882
								if( MFI_High > -52.0639 )
									ret := 0.595745
			if( Negative_Money_Flow_Sum > 5.31229e+06 )
				if( MFI <= 0.683292 )
					if( Negative_Money_Flow <= 5.18435e+07 )
						ret := 0.210526
					if( Negative_Money_Flow > 5.18435e+07 )
						if( Negative_Money_Flow_Sum <= 5.09124e+08 )
							if( bullPower <= -1.09436 )
								ret := -0.818182 // sell
							if( bullPower > -1.09436 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 5.09124e+08 )
							ret := -0.450000
				if( MFI > 0.683292 )
					if( bullPower <= -0.190564 )
						if( Raw_Money_Flow <= 6.19795e+06 )
							if( Money_Flow_Ratio <= 0.066763 )
								if( Negative_Money_Flow_Sum <= 9.94853e+06 )
									ret := -0.421053
								if( Negative_Money_Flow_Sum > 9.94853e+06 )
									ret := 0.187500
							if( Money_Flow_Ratio > 0.066763 )
								if( MFI_High <= -58.7392 )
									ret := 0.650000
								if( MFI_High > -58.7392 )
									ret := 0.149254
						if( Raw_Money_Flow > 6.19795e+06 )
							if( Typical_Price <= 146.909 )
								ret := 0.692308
							if( Typical_Price > 146.909 )
								if( MFI_Low <= -18.7496 )
									ret := -0.600000
								if( MFI_Low > -18.7496 )
									ret := -0.809524 // sell
					if( bullPower > -0.190564 )
						if( Typical_Price <= 154.213 )
							if( bbm <= 0.28975 )
								if( bbp <= -0.408606 )
									ret := 0.622222
								if( bbp > -0.408606 )
									ret := 0.114958
							if( bbm > 0.28975 )
								if( Positive_Money_Flow <= 196830 )
									ret := -0.029070
								if( Positive_Money_Flow > 196830 )
									ret := -0.804878 // sell
						if( Typical_Price > 154.213 )
							if( Negative_Money_Flow_Sum <= 2.12464e+08 )
								if( MFI_Low <= -0.725779 )
									ret := 0.116049
								if( MFI_Low > -0.725779 )
									ret := 0.354515
							if( Negative_Money_Flow_Sum > 2.12464e+08 )
								if( MFI_High <= -78.9353 )
									ret := 1.000000 // buy
								if( MFI_High > -78.9353 )
									ret := 0.600000
		if( Positive_Money_Flow_Sum > 2.50304e+06 )
			if( Positive_Money_Flow_Sum <= 5.10741e+08 )
				if( Negative_Money_Flow <= 5.80226e+07 )
					if( Positive_Money_Flow <= 3.13539e+07 )
						if( MFI_Low <= 36.4425 )
							if( bbp <= -0.095888 )
								if( Typical_Price <= 151.348 )
									ret := 0.053178
								if( Typical_Price > 151.348 )
									ret := -0.015014
							if( bbp > -0.095888 )
								if( Negative_Money_Flow_Sum <= 4.45743e+06 )
									ret := -0.216524
								if( Negative_Money_Flow_Sum > 4.45743e+06 )
									ret := -0.073007
						if( MFI_Low > 36.4425 )
							if( Positive_Money_Flow_Sum <= 8.27485e+07 )
								if( bullPower <= 0.058871 )
									ret := 0.093665
								if( bullPower > 0.058871 )
									ret := -0.022743
							if( Positive_Money_Flow_Sum > 8.27485e+07 )
								if( MFI_High <= -22.3881 )
									ret := 0.232158
								if( MFI_High > -22.3881 )
									ret := 0.045178
					if( Positive_Money_Flow > 3.13539e+07 )
						if( bbp <= -0.648661 )
							if( Positive_Money_Flow_Sum <= 1.81989e+08 )
								if( MFI_Low <= -2.13049 )
									ret := 0.538462
								if( MFI_Low > -2.13049 )
									ret := -0.743902 // sell
							if( Positive_Money_Flow_Sum > 1.81989e+08 )
								if( bearPower <= -0.701974 )
									ret := 0.571429
								if( bearPower > -0.701974 )
									ret := -0.388889
						if( bbp > -0.648661 )
							if( bearPower <= 0.493179 )
								if( MFI <= 40.0608 )
									ret := 0.500000
								if( MFI > 40.0608 )
									ret := 0.169306
							if( bearPower > 0.493179 )
								if( bbm <= 0.323367 )
									ret := 0.333333
								if( bbm > 0.323367 )
									ret := -0.666667
				if( Negative_Money_Flow > 5.80226e+07 )
					if( MFI_High <= -46.2525 )
						if( Positive_Money_Flow_Sum <= 1.72664e+07 )
							if( bbm <= 0.942293 )
								if( Raw_Money_Flow <= 6.35269e+07 )
									ret := -0.882353 // sell
								if( Raw_Money_Flow > 6.35269e+07 )
									ret := 0.177215
							if( bbm > 0.942293 )
								if( MFI <= 2.32517 )
									ret := 0.000000
								if( MFI > 2.32517 )
									ret := 0.730337 // buy
						if( Positive_Money_Flow_Sum > 1.72664e+07 )
							if( Positive_Money_Flow_Sum <= 1.02565e+08 )
								if( bbp <= -1.39737 )
									ret := -0.915888 // sell
								if( bbp > -1.39737 )
									ret := 0.031250
							if( Positive_Money_Flow_Sum > 1.02565e+08 )
								if( bbp <= -2.45909 )
									ret := 0.562500
								if( bbp > -2.45909 )
									ret := 0.017442
					if( MFI_High > -46.2525 )
						if( bullPower <= -0.157453 )
							if( Negative_Money_Flow <= 6.63579e+07 )
								if( Typical_Price <= 145.301 )
									ret := -1.000000 // sell
								if( Typical_Price > 145.301 )
									ret := -0.516129
							if( Negative_Money_Flow > 6.63579e+07 )
								if( Typical_Price <= 155.522 )
									ret := -0.724138 // sell
								if( Typical_Price > 155.522 )
									ret := -0.979798 // sell
						if( bullPower > -0.157453 )
							if( bearPower <= -0.934082 )
								if( Typical_Price <= 165.853 )
									ret := 0.666667
								if( Typical_Price > 165.853 )
									ret := 0.125000
							if( bearPower > -0.934082 )
								if( bbm <= 0.640826 )
									ret := 0.036145
								if( bbm > 0.640826 )
									ret := -0.457143
			if( Positive_Money_Flow_Sum > 5.10741e+08 )
				if( MFI_High <= -24.2832 )
					if( bbm <= 0.571517 )
						if( MFI_High <= -33.3459 )
							ret := -0.500000
						if( MFI_High > -33.3459 )
							ret := -0.800000 // sell
					if( bbm > 0.571517 )
						ret := -1.000000 // sell
				if( MFI_High > -24.2832 )
					if( Negative_Money_Flow_Sum <= 4.43719e+08 )
						if( MFI_Low <= 41.4787 )
							ret := -1.000000 // sell
						if( MFI_Low > 41.4787 )
							if( bearPower <= -0.359685 )
								if( bbm <= 0.763766 )
									ret := -0.076923
								if( bbm > 0.763766 )
									ret := 0.960000 // buy
							if( bearPower > -0.359685 )
								if( bbm <= 0.24895 )
									ret := -0.386100
								if( bbm > 0.24895 )
									ret := 0.007117
					if( Negative_Money_Flow_Sum > 4.43719e+08 )
						if( Positive_Money_Flow_Sum <= 9.78071e+08 )
							if( bbm <= 0.348162 )
								ret := 0.454545
							if( bbm > 0.348162 )
								if( bullPower <= 0.608839 )
									ret := 1.000000 // buy
								if( bullPower > 0.608839 )
									ret := 0.866667 // buy
						if( Positive_Money_Flow_Sum > 9.78071e+08 )
							ret := 0.000000
	if( Positive_Money_Flow > 3.46723e+07 )
		if( MFI <= 90.8519 )
			if( bbm <= 0.521336 )
				if( bullPower <= -0.2008 )
					if( Money_Flow_Ratio <= 0.315927 )
						if( Typical_Price <= 158.675 )
							if( Money_Flow_Ratio <= 0.193189 )
								ret := -0.571429
							if( Money_Flow_Ratio > 0.193189 )
								if( bbm <= 0.38414 )
									ret := -0.857143 // sell
								if( bbm > 0.38414 )
									ret := -1.000000 // sell
						if( Typical_Price > 158.675 )
							if( Negative_Money_Flow_Sum <= 4.53706e+08 )
								ret := 0.777778 // buy
							if( Negative_Money_Flow_Sum > 4.53706e+08 )
								ret := -0.473684
					if( Money_Flow_Ratio > 0.315927 )
						if( Typical_Price <= 154.599 )
							if( bbp <= -1.3196 )
								ret := -0.900000 // sell
							if( bbp > -1.3196 )
								if( bbp <= -0.883959 )
									ret := 0.071429
								if( bbp > -0.883959 )
									ret := -0.592593
						if( Typical_Price > 154.599 )
							if( Typical_Price <= 159.26 )
								if( Positive_Money_Flow_Sum <= 2.39504e+08 )
									ret := 0.821429 // buy
								if( Positive_Money_Flow_Sum > 2.39504e+08 )
									ret := 0.000000
							if( Typical_Price > 159.26 )
								if( Negative_Money_Flow_Sum <= 5.304e+08 )
									ret := 0.130435
								if( Negative_Money_Flow_Sum > 5.304e+08 )
									ret := -0.750000 // sell
				if( bullPower > -0.2008 )
					if( Negative_Money_Flow_Sum <= 9.12478e+07 )
						if( bbm <= 0.191924 )
							if( Positive_Money_Flow <= 3.83781e+07 )
								if( bullPower <= 0.521506 )
									ret := -0.250000
								if( bullPower > 0.521506 )
									ret := 0.900000 // buy
							if( Positive_Money_Flow > 3.83781e+07 )
								if( bearPower <= -0.030285 )
									ret := 0.000000
								if( bearPower > -0.030285 )
									ret := 0.000000
						if( bbm > 0.191924 )
							if( MFI_Low <= 55.6879 )
								if( MFI <= 65.2429 )
									ret := -0.888889 // sell
								if( MFI > 65.2429 )
									ret := -0.032258
							if( MFI_Low > 55.6879 )
								if( Raw_Money_Flow <= 4.16928e+07 )
									ret := -0.380952
								if( Raw_Money_Flow > 4.16928e+07 )
									ret := -0.648352
					if( Negative_Money_Flow_Sum > 9.12478e+07 )
						if( Raw_Money_Flow <= 1.06835e+08 )
							if( MFI_High <= -52.5041 )
								if( MFI_Low <= 2.89624 )
									ret := 0.419355
								if( MFI_Low > 2.89624 )
									ret := 0.933333 // buy
							if( MFI_High > -52.5041 )
								if( MFI <= 27.9174 )
									ret := -1.000000 // sell
								if( MFI > 27.9174 )
									ret := 0.091553
						if( Raw_Money_Flow > 1.06835e+08 )
							if( Negative_Money_Flow_Sum <= 2.1721e+08 )
								if( Money_Flow_Ratio <= 4.81526 )
									ret := -0.794872 // sell
								if( Money_Flow_Ratio > 4.81526 )
									ret := -0.200000
							if( Negative_Money_Flow_Sum > 2.1721e+08 )
								ret := -0.181818
			if( bbm > 0.521336 )
				if( MFI <= 66.9389 )
					if( MFI <= 16.4898 )
						ret := 0.615385
					if( MFI > 16.4898 )
						if( bbm <= 1.3041 )
							if( Negative_Money_Flow_Sum <= 1.67107e+08 )
								if( bbm <= 0.598949 )
									ret := -0.114286
								if( bbm > 0.598949 )
									ret := -0.706250 // sell
							if( Negative_Money_Flow_Sum > 1.67107e+08 )
								if( bullPower <= -0.316648 )
									ret := -0.491620
								if( bullPower > -0.316648 )
									ret := -0.198971
						if( bbm > 1.3041 )
							if( bullPower <= 0.727522 )
								ret := -0.187500
							if( bullPower > 0.727522 )
								ret := 0.764706 // buy
				if( MFI > 66.9389 )
					if( Typical_Price <= 184.891 )
						if( bbp <= 0.986807 )
							if( Positive_Money_Flow <= 3.96775e+07 )
								if( bearPower <= 0.054899 )
									ret := -0.700000 // sell
								if( bearPower > 0.054899 )
									ret := 0.666667
							if( Positive_Money_Flow > 3.96775e+07 )
								if( bearPower <= 0.13033 )
									ret := 0.477612
								if( bearPower > 0.13033 )
									ret := -0.384615
						if( bbp > 0.986807 )
							if( Positive_Money_Flow <= 6.35041e+07 )
								if( Typical_Price <= 140.344 )
									ret := 0.470588
								if( Typical_Price > 140.344 )
									ret := -0.421739
							if( Positive_Money_Flow > 6.35041e+07 )
								if( Money_Flow_Ratio <= 3.72093 )
									ret := -0.285714
								if( Money_Flow_Ratio > 3.72093 )
									ret := 0.679245
					if( Typical_Price > 184.891 )
						ret := -1.000000 // sell
		if( MFI > 90.8519 )
			if( Positive_Money_Flow <= 7.50586e+07 )
				if( bbm <= 1.18869 )
					if( bullPower <= 0.589274 )
						if( Positive_Money_Flow <= 6.17879e+07 )
							if( MFI_Low <= 75.5312 )
								ret := -0.666667
							if( MFI_Low > 75.5312 )
								ret := -0.444444
						if( Positive_Money_Flow > 6.17879e+07 )
							ret := 0.333333
					if( bullPower > 0.589274 )
						if( Raw_Money_Flow <= 4.12239e+07 )
							if( bbp <= 1.48878 )
								if( MFI_High <= 12.3408 )
									ret := -0.400000
								if( MFI_High > 12.3408 )
									ret := 0.611111
							if( bbp > 1.48878 )
								ret := -0.526316
						if( Raw_Money_Flow > 4.12239e+07 )
							if( Typical_Price <= 146.782 )
								if( Typical_Price <= 139.046 )
									ret := 0.818182 // buy
								if( Typical_Price > 139.046 )
									ret := -0.785714 // sell
							if( Typical_Price > 146.782 )
								if( bullPower <= 1.15786 )
									ret := 0.741379 // buy
								if( bullPower > 1.15786 )
									ret := 0.170732
				if( bbm > 1.18869 )
					ret := -0.700000 // sell
			if( Positive_Money_Flow > 7.50586e+07 )
				if( Typical_Price <= 167.897 )
					if( Money_Flow_Ratio <= 38.5157 )
						if( Typical_Price <= 163.058 )
							if( bbp <= 0.640849 )
								if( MFI_High <= 14.0859 )
									ret := 0.000000
								if( MFI_High > 14.0859 )
									ret := 0.437500
							if( bbp > 0.640849 )
								if( Money_Flow_Ratio <= 12.2691 )
									ret := 0.200000
								if( Money_Flow_Ratio > 12.2691 )
									ret := -0.968750 // sell
						if( Typical_Price > 163.058 )
							if( Negative_Money_Flow_Sum <= 8.7214e+06 )
								ret := 0.272727
							if( Negative_Money_Flow_Sum > 8.7214e+06 )
								if( bullPower <= 1.23742 )
									ret := 0.888889 // buy
								if( bullPower > 1.23742 )
									ret := 0.600000
					if( Money_Flow_Ratio > 38.5157 )
						if( bbm <= 0.787423 )
							if( MFI_High <= 17.9803 )
								ret := -0.333333
							if( MFI_High > 17.9803 )
								ret := 0.357143
						if( bbm > 0.787423 )
							if( MFI_High <= 17.3194 )
								ret := 1.000000 // buy
							if( MFI_High > 17.3194 )
								ret := 0.550000
				if( Typical_Price > 167.897 )
					if( MFI <= 93.1094 )
						ret := 0.200000
					if( MFI > 93.1094 )
						if( Raw_Money_Flow <= 1.46491e+08 )
							if( Money_Flow_Ratio <= 25.6838 )
								ret := -0.923077 // sell
							if( Money_Flow_Ratio > 25.6838 )
								ret := -1.000000 // sell
						if( Raw_Money_Flow > 1.46491e+08 )
							ret := -0.700000 // sell
	
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


//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")

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
float op_operation = decision_tree_0_AMD_1Min_82c9ffd6(bullPower, bbp, bearPower, bbm, BBPower_Color, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


