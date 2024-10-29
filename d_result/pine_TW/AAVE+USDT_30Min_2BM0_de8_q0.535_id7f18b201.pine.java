//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: AAVEUSDT_30Min_2BM0_7f18b201 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_30Min_2BM0_7f18b201", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_30Min_7f18b201(bullPower, bbp, bearPower, bbm, BBPower_Color, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Positive_Money_Flow_Sum <= 6.81985e+07 )
		if( bbm <= 13.4456 )
			if( Typical_Price <= 402.903 )
				if( bearPower <= 7.21698 )
					if( Negative_Money_Flow_Sum <= 2.74104e+07 )
						if( Typical_Price <= 84.2668 )
							if( bbm <= 0.521962 )
								if( Positive_Money_Flow_Sum <= 354911 )
									ret := -0.021323
								if( Positive_Money_Flow_Sum > 354911 )
									ret := 0.055636
							if( bbm > 0.521962 )
								if( bbp <= 2.48393 )
									ret := 0.138482
								if( bbp > 2.48393 )
									ret := -0.051570
						if( Typical_Price > 84.2668 )
							if( bbm <= 3.11002 )
								if( Money_Flow_Ratio <= 0.720734 )
									ret := 0.052851
								if( Money_Flow_Ratio > 0.720734 )
									ret := 0.001531
							if( bbm > 3.11002 )
								if( Positive_Money_Flow <= 2.30777e+06 )
									ret := 0.085341
								if( Positive_Money_Flow > 2.30777e+06 )
									ret := -0.033911
					if( Negative_Money_Flow_Sum > 2.74104e+07 )
						if( MFI_Low <= 4.21333 )
							if( Typical_Price <= 312.4 )
								if( bbm <= 6.12 )
									ret := -0.200000
								if( bbm > 6.12 )
									ret := 0.764706 // buy
							if( Typical_Price > 312.4 )
								if( Negative_Money_Flow_Sum <= 2.79995e+07 )
									ret := 0.714286 // buy
								if( Negative_Money_Flow_Sum > 2.79995e+07 )
									ret := -0.480000
						if( MFI_Low > 4.21333 )
							if( Negative_Money_Flow_Sum <= 4.92728e+07 )
								if( MFI_Low <= 23.7609 )
									ret := 0.600806
								if( MFI_Low > 23.7609 )
									ret := 0.150000
							if( Negative_Money_Flow_Sum > 4.92728e+07 )
								if( MFI <= 27.854 )
									ret := -1.000000 // sell
								if( MFI > 27.854 )
									ret := -0.571429
				if( bearPower > 7.21698 )
					if( Typical_Price <= 377.44 )
						if( MFI <= 83.3369 )
							if( Positive_Money_Flow <= 4.94019e+06 )
								if( bearPower <= 8.63295 )
									ret := 0.517857
								if( bearPower > 8.63295 )
									ret := 0.833333 // buy
							if( Positive_Money_Flow > 4.94019e+06 )
								if( MFI_High <= -5.26437 )
									ret := 0.375000
								if( MFI_High > -5.26437 )
									ret := -0.625000
						if( MFI > 83.3369 )
							if( Negative_Money_Flow <= 3.25956e+06 )
								if( Negative_Money_Flow_Sum <= 4.45632e+06 )
									ret := 0.532258
								if( Negative_Money_Flow_Sum > 4.45632e+06 )
									ret := -0.190476
							if( Negative_Money_Flow > 3.25956e+06 )
								ret := -1.000000 // sell
					if( Typical_Price > 377.44 )
						if( MFI <= 86.7546 )
							if( bearPower <= 9.34967 )
								if( Positive_Money_Flow_Sum <= 2.50034e+07 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 2.50034e+07 )
									ret := 0.863636 // buy
							if( bearPower > 9.34967 )
								if( MFI <= 76.9558 )
									ret := -0.666667
								if( MFI > 76.9558 )
									ret := 0.266667
						if( MFI > 86.7546 )
							if( MFI <= 90.2537 )
								if( bbm <= 6.7784 )
									ret := -1.000000 // sell
								if( bbm > 6.7784 )
									ret := -0.750000 // sell
							if( MFI > 90.2537 )
								ret := 0.333333
			if( Typical_Price > 402.903 )
				if( Positive_Money_Flow_Sum <= 2.54158e+07 )
					if( Negative_Money_Flow_Sum <= 1.1113e+07 )
						if( Negative_Money_Flow_Sum <= 8.73733e+06 )
							if( bbm <= 6.84 )
								if( Positive_Money_Flow_Sum <= 1.97659e+07 )
									ret := -0.139423
								if( Positive_Money_Flow_Sum > 1.97659e+07 )
									ret := -0.594595
							if( bbm > 6.84 )
								if( Positive_Money_Flow <= 1.35083e+06 )
									ret := -0.176471
								if( Positive_Money_Flow > 1.35083e+06 )
									ret := 0.427083
						if( Negative_Money_Flow_Sum > 8.73733e+06 )
							if( bullPower <= 13.0399 )
								if( MFI_High <= -24.9799 )
									ret := 0.059172
								if( MFI_High > -24.9799 )
									ret := 0.430303
							if( bullPower > 13.0399 )
								if( bbm <= 7.08752 )
									ret := -0.500000
								if( bbm > 7.08752 )
									ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 1.1113e+07 )
						if( MFI <= 45.23 )
							if( Negative_Money_Flow <= 1.54243e+06 )
								if( Negative_Money_Flow_Sum <= 1.26635e+07 )
									ret := -0.621212
								if( Negative_Money_Flow_Sum > 1.26635e+07 )
									ret := -0.144852
							if( Negative_Money_Flow > 1.54243e+06 )
								if( bearPower <= -0.609872 )
									ret := 0.062814
								if( bearPower > -0.609872 )
									ret := 0.826087 // buy
						if( MFI > 45.23 )
							if( Positive_Money_Flow_Sum <= 2.17955e+07 )
								if( MFI <= 58.35 )
									ret := -0.342508
								if( MFI > 58.35 )
									ret := 0.051724
							if( Positive_Money_Flow_Sum > 2.17955e+07 )
								if( Negative_Money_Flow <= 4.87343e+06 )
									ret := -0.556250
								if( Negative_Money_Flow > 4.87343e+06 )
									ret := 0.600000
				if( Positive_Money_Flow_Sum > 2.54158e+07 )
					if( Negative_Money_Flow_Sum <= 8.32764e+06 )
						if( Money_Flow_Ratio <= 16.4453 )
							if( Positive_Money_Flow_Sum <= 5.79217e+07 )
								if( Positive_Money_Flow_Sum <= 4.10709e+07 )
									ret := -0.278689
								if( Positive_Money_Flow_Sum > 4.10709e+07 )
									ret := -0.878788 // sell
							if( Positive_Money_Flow_Sum > 5.79217e+07 )
								ret := 1.000000 // buy
						if( Money_Flow_Ratio > 16.4453 )
							if( bbm <= 10.2721 )
								ret := 0.500000
							if( bbm > 10.2721 )
								if( Money_Flow_Ratio <= 24.5484 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 24.5484 )
									ret := 0.750000 // buy
					if( Negative_Money_Flow_Sum > 8.32764e+06 )
						if( Negative_Money_Flow_Sum <= 1.14616e+07 )
							if( Positive_Money_Flow <= 1.98323e+06 )
								if( Typical_Price <= 423.147 )
									ret := 0.541667
								if( Typical_Price > 423.147 )
									ret := 0.962963 // buy
							if( Positive_Money_Flow > 1.98323e+06 )
								if( bullPower <= 15.0785 )
									ret := -0.176471
								if( bullPower > 15.0785 )
									ret := 0.437500
						if( Negative_Money_Flow_Sum > 1.14616e+07 )
							if( MFI_High <= -13.5444 )
								if( MFI <= 46.762 )
									ret := -0.157895
								if( MFI > 46.762 )
									ret := 0.313043
							if( MFI_High > -13.5444 )
								if( bbp <= 8.43601 )
									ret := 0.355556
								if( bbp > 8.43601 )
									ret := -0.383333
		if( bbm > 13.4456 )
			if( Typical_Price <= 498.407 )
				if( bbm <= 22.918 )
					if( bbp <= -44.679 )
						if( MFI <= 22.385 )
							if( Negative_Money_Flow_Sum <= 8.72469e+07 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 8.72469e+07 )
								ret := 0.400000
						if( MFI > 22.385 )
							if( Negative_Money_Flow_Sum <= 3.50398e+07 )
								ret := -0.500000
							if( Negative_Money_Flow_Sum > 3.50398e+07 )
								if( Positive_Money_Flow_Sum <= 2.92874e+07 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 2.92874e+07 )
									ret := 1.000000 // buy
					if( bbp > -44.679 )
						if( Negative_Money_Flow_Sum <= 5.21298e+07 )
							if( bbp <= -7.80488 )
								if( MFI <= 19.8127 )
									ret := 0.588235
								if( MFI > 19.8127 )
									ret := 0.027304
							if( bbp > -7.80488 )
								if( Typical_Price <= 379.883 )
									ret := 0.636943
								if( Typical_Price > 379.883 )
									ret := 0.174721
						if( Negative_Money_Flow_Sum > 5.21298e+07 )
							if( MFI_High <= -45.7597 )
								if( Negative_Money_Flow <= 3.54602e+06 )
									ret := -0.250000
								if( Negative_Money_Flow > 3.54602e+06 )
									ret := 0.944444 // buy
							if( MFI_High > -45.7597 )
								ret := 1.000000 // buy
				if( bbm > 22.918 )
					if( Positive_Money_Flow <= 9.72406e+06 )
						if( bbp <= 48.0849 )
							if( MFI_Low <= 29.9112 )
								if( MFI_Low <= 27.8931 )
									ret := 0.731707 // buy
								if( MFI_Low > 27.8931 )
									ret := -0.200000
							if( MFI_Low > 29.9112 )
								if( bbp <= -29.9756 )
									ret := 0.500000
								if( bbp > -29.9756 )
									ret := 0.952381 // buy
						if( bbp > 48.0849 )
							ret := 0.000000
					if( Positive_Money_Flow > 9.72406e+06 )
						if( bullPower <= -15.227 )
							ret := 0.750000 // buy
						if( bullPower > -15.227 )
							ret := -1.000000 // sell
			if( Typical_Price > 498.407 )
				if( bbp <= -38.1274 )
					if( Positive_Money_Flow_Sum <= 4.94036e+07 )
						if( MFI_High <= -45.521 )
							ret := 1.000000 // buy
						if( MFI_High > -45.521 )
							if( MFI_Low <= 15.7025 )
								ret := 0.500000
							if( MFI_Low > 15.7025 )
								ret := 0.800000 // buy
					if( Positive_Money_Flow_Sum > 4.94036e+07 )
						if( Positive_Money_Flow <= 1.35327e+06 )
							ret := 0.000000
						if( Positive_Money_Flow > 1.35327e+06 )
							ret := -0.800000 // sell
				if( bbp > -38.1274 )
					if( MFI_Low <= 27.3703 )
						if( Typical_Price <= 508.481 )
							if( Negative_Money_Flow_Sum <= 4.52112e+07 )
								if( bbm <= 14.2691 )
									ret := 0.428571
								if( bbm > 14.2691 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 4.52112e+07 )
								if( Money_Flow_Ratio <= 0.647161 )
									ret := 0.750000 // buy
								if( Money_Flow_Ratio > 0.647161 )
									ret := 0.750000 // buy
						if( Typical_Price > 508.481 )
							if( Positive_Money_Flow_Sum <= 6.33436e+07 )
								if( Raw_Money_Flow <= 3.40755e+06 )
									ret := -0.066667
								if( Raw_Money_Flow > 3.40755e+06 )
									ret := -0.779221 // sell
							if( Positive_Money_Flow_Sum > 6.33436e+07 )
								ret := 0.333333
					if( MFI_Low > 27.3703 )
						if( Positive_Money_Flow_Sum <= 6.08029e+07 )
							if( Positive_Money_Flow_Sum <= 2.85083e+07 )
								if( Positive_Money_Flow_Sum <= 2.17185e+07 )
									ret := -0.125000
								if( Positive_Money_Flow_Sum > 2.17185e+07 )
									ret := -0.800000 // sell
							if( Positive_Money_Flow_Sum > 2.85083e+07 )
								if( Negative_Money_Flow_Sum <= 3.66746e+07 )
									ret := 0.671642
								if( Negative_Money_Flow_Sum > 3.66746e+07 )
									ret := -0.068966
						if( Positive_Money_Flow_Sum > 6.08029e+07 )
							if( Positive_Money_Flow <= 1.12301e+07 )
								if( bbm <= 14.655 )
									ret := -0.500000
								if( bbm > 14.655 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow > 1.12301e+07 )
								ret := 0.000000
	if( Positive_Money_Flow_Sum > 6.81985e+07 )
		if( Negative_Money_Flow <= 8.38426e+06 )
			if( Positive_Money_Flow_Sum <= 7.95824e+07 )
				if( Raw_Money_Flow <= 3.7252e+06 )
					if( Raw_Money_Flow <= 3.3937e+06 )
						ret := 0.000000
					if( Raw_Money_Flow > 3.3937e+06 )
						ret := 0.750000 // buy
				if( Raw_Money_Flow > 3.7252e+06 )
					if( Positive_Money_Flow <= 1.53566e+07 )
						if( Positive_Money_Flow <= 2.84792e+06 )
							if( Typical_Price <= 402.525 )
								ret := 0.166667
							if( Typical_Price > 402.525 )
								if( Typical_Price <= 608.124 )
									ret := -0.882353 // sell
								if( Typical_Price > 608.124 )
									ret := 0.250000
						if( Positive_Money_Flow > 2.84792e+06 )
							if( Typical_Price <= 331.333 )
								ret := -0.571429
							if( Typical_Price > 331.333 )
								if( Raw_Money_Flow <= 5.82909e+06 )
									ret := -0.888889 // sell
								if( Raw_Money_Flow > 5.82909e+06 )
									ret := -1.000000 // sell
					if( Positive_Money_Flow > 1.53566e+07 )
						if( MFI_High <= -7.49642 )
							ret := 0.250000
						if( MFI_High > -7.49642 )
							ret := -0.800000 // sell
			if( Positive_Money_Flow_Sum > 7.95824e+07 )
				if( Positive_Money_Flow_Sum <= 9.32369e+07 )
					if( Positive_Money_Flow_Sum <= 8.89313e+07 )
						if( Money_Flow_Ratio <= 1.53103 )
							if( Positive_Money_Flow_Sum <= 8.20386e+07 )
								ret := 0.000000
							if( Positive_Money_Flow_Sum > 8.20386e+07 )
								ret := -1.000000 // sell
						if( Money_Flow_Ratio > 1.53103 )
							if( bullPower <= 40.5753 )
								if( Positive_Money_Flow <= 5.379e+06 )
									ret := -0.384615
								if( Positive_Money_Flow > 5.379e+06 )
									ret := 0.500000
							if( bullPower > 40.5753 )
								ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 8.89313e+07 )
						if( bearPower <= 13.3516 )
							if( Negative_Money_Flow <= 2.27016e+06 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow > 2.27016e+06 )
								if( Raw_Money_Flow <= 4.60537e+06 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 4.60537e+06 )
									ret := 0.000000
						if( bearPower > 13.3516 )
							if( bearPower <= 17.0165 )
								if( MFI <= 77.1236 )
									ret := -0.500000
								if( MFI > 77.1236 )
									ret := 0.000000
							if( bearPower > 17.0165 )
								ret := 0.600000
				if( Positive_Money_Flow_Sum > 9.32369e+07 )
					if( Positive_Money_Flow <= 6.00066e+06 )
						if( Negative_Money_Flow_Sum <= 4.07634e+07 )
							if( bearPower <= 5.91526 )
								ret := 0.000000
							if( bearPower > 5.91526 )
								if( bearPower <= 11.0157 )
									ret := -1.000000 // sell
								if( bearPower > 11.0157 )
									ret := -0.250000
						if( Negative_Money_Flow_Sum > 4.07634e+07 )
							ret := -1.000000 // sell
					if( Positive_Money_Flow > 6.00066e+06 )
						if( bbp <= 70.2085 )
							if( Negative_Money_Flow_Sum <= 3.10899e+07 )
								if( bbm <= 19.06 )
									ret := 0.833333 // buy
								if( bbm > 19.06 )
									ret := -0.250000
							if( Negative_Money_Flow_Sum > 3.10899e+07 )
								if( Positive_Money_Flow_Sum <= 1.9596e+08 )
									ret := -0.515152
								if( Positive_Money_Flow_Sum > 1.9596e+08 )
									ret := 0.750000 // buy
						if( bbp > 70.2085 )
							ret := -1.000000 // sell
		if( Negative_Money_Flow > 8.38426e+06 )
			if( bbm <= 23.0182 )
				if( Negative_Money_Flow_Sum <= 4.4817e+07 )
					if( bbp <= 57.2757 )
						if( bearPower <= 15.6766 )
							ret := 0.666667
						if( bearPower > 15.6766 )
							ret := 1.000000 // buy
					if( bbp > 57.2757 )
						ret := 0.166667
				if( Negative_Money_Flow_Sum > 4.4817e+07 )
					if( Positive_Money_Flow_Sum <= 8.09246e+07 )
						ret := 0.000000
					if( Positive_Money_Flow_Sum > 8.09246e+07 )
						if( bbp <= 22.8296 )
							ret := -1.000000 // sell
						if( bbp > 22.8296 )
							ret := -0.750000 // sell
			if( bbm > 23.0182 )
				if( bullPower <= 38.7882 )
					if( Negative_Money_Flow_Sum <= 1.17658e+08 )
						if( Positive_Money_Flow_Sum <= 9.15126e+07 )
							ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 9.15126e+07 )
							if( Typical_Price <= 556.419 )
								ret := 1.000000 // buy
							if( Typical_Price > 556.419 )
								ret := 0.000000
					if( Negative_Money_Flow_Sum > 1.17658e+08 )
						if( Negative_Money_Flow_Sum <= 1.33836e+08 )
							ret := -0.800000 // sell
						if( Negative_Money_Flow_Sum > 1.33836e+08 )
							ret := 1.000000 // buy
				if( bullPower > 38.7882 )
					ret := -0.500000
	
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
float op_operation = decision_tree_0_AAVEUSDT_30Min_7f18b201(bullPower, bbp, bearPower, bbm, BBPower_Color, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


