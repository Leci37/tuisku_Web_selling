//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: AVAXUSDT_30Min_2BM0_0a5c1225 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_30Min_2BM0_0a5c1225", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_30Min_0a5c1225(bullPower, bbp, bearPower, bbm, BBPower_Color, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bearPower <= -3.17494 )
		if( Positive_Money_Flow_Sum <= 3.66792e+07 )
			if( Negative_Money_Flow_Sum <= 4.2305e+07 )
				if( Negative_Money_Flow <= 5.89365e+06 )
					ret := 0.600000
				if( Negative_Money_Flow > 5.89365e+06 )
					if( bearPower <= -3.49681 )
						if( Typical_Price <= 44.8513 )
							ret := 1.000000 // buy
						if( Typical_Price > 44.8513 )
							ret := 0.818182 // buy
					if( bearPower > -3.49681 )
						ret := 0.692308
			if( Negative_Money_Flow_Sum > 4.2305e+07 )
				if( Money_Flow_Ratio <= 0.152626 )
					if( bbm <= 1.54143 )
						ret := -0.750000 // sell
					if( bbm > 1.54143 )
						if( bbp <= -5.51691 )
							if( Raw_Money_Flow <= 1.10197e+07 )
								ret := 0.857143 // buy
							if( Raw_Money_Flow > 1.10197e+07 )
								if( MFI_Low <= -9.06305 )
									ret := 1.000000 // buy
								if( MFI_Low > -9.06305 )
									ret := 0.888889 // buy
						if( bbp > -5.51691 )
							ret := -0.111111
				if( Money_Flow_Ratio > 0.152626 )
					if( MFI_Low <= -2.64729 )
						if( Raw_Money_Flow <= 1.62357e+07 )
							if( bbm <= 2.18878 )
								if( Negative_Money_Flow <= 9.78468e+06 )
									ret := -0.529412
								if( Negative_Money_Flow > 9.78468e+06 )
									ret := -0.894737 // sell
							if( bbm > 2.18878 )
								ret := 0.222222
						if( Raw_Money_Flow > 1.62357e+07 )
							if( MFI_High <= -64.4147 )
								ret := 0.833333 // buy
							if( MFI_High > -64.4147 )
								ret := -0.272727
					if( MFI_Low > -2.64729 )
						if( MFI_High <= -57.2757 )
							if( Negative_Money_Flow_Sum <= 8.68943e+07 )
								if( Positive_Money_Flow_Sum <= 1.74893e+07 )
									ret := 0.739130 // buy
								if( Positive_Money_Flow_Sum > 1.74893e+07 )
									ret := -0.650000
							if( Negative_Money_Flow_Sum > 8.68943e+07 )
								if( Negative_Money_Flow <= 1.36826e+07 )
									ret := 0.666667
								if( Negative_Money_Flow > 1.36826e+07 )
									ret := 1.000000 // buy
						if( MFI_High > -57.2757 )
							if( Positive_Money_Flow_Sum <= 1.62429e+07 )
								ret := -0.722222 // sell
							if( Positive_Money_Flow_Sum > 1.62429e+07 )
								if( bullPower <= -1.98561 )
									ret := -0.333333
								if( bullPower > -1.98561 )
									ret := 0.296089
		if( Positive_Money_Flow_Sum > 3.66792e+07 )
			if( bearPower <= -3.24679 )
				if( MFI <= 19.5805 )
					if( MFI_Low <= -1.96276 )
						ret := 1.000000 // buy
					if( MFI_Low > -1.96276 )
						ret := -0.812500 // sell
				if( MFI > 19.5805 )
					if( bbm <= 2.35602 )
						if( MFI <= 30.1445 )
							if( bullPower <= -2.0277 )
								ret := 0.933333 // buy
							if( bullPower > -2.0277 )
								ret := 1.000000 // buy
						if( MFI > 30.1445 )
							if( Negative_Money_Flow_Sum <= 1.4803e+08 )
								if( MFI_High <= -45.2034 )
									ret := 0.363636
								if( MFI_High > -45.2034 )
									ret := 0.818182 // buy
							if( Negative_Money_Flow_Sum > 1.4803e+08 )
								ret := 1.000000 // buy
					if( bbm > 2.35602 )
						if( Negative_Money_Flow_Sum <= 6.6129e+07 )
							if( Money_Flow_Ratio <= 0.843061 )
								if( Positive_Money_Flow_Sum <= 4.97292e+07 )
									ret := 0.888889 // buy
								if( Positive_Money_Flow_Sum > 4.97292e+07 )
									ret := 1.000000 // buy
							if( Money_Flow_Ratio > 0.843061 )
								if( MFI_High <= -24.2524 )
									ret := 0.500000
								if( MFI_High > -24.2524 )
									ret := 0.928571 // buy
						if( Negative_Money_Flow_Sum > 6.6129e+07 )
							if( Raw_Money_Flow <= 3.13405e+07 )
								if( bbm <= 3.93763 )
									ret := 0.449541
								if( bbm > 3.93763 )
									ret := -0.388889
							if( Raw_Money_Flow > 3.13405e+07 )
								if( bearPower <= -5.25349 )
									ret := 1.000000 // buy
								if( bearPower > -5.25349 )
									ret := 0.681818
			if( bearPower > -3.24679 )
				ret := -0.052632
	if( bearPower > -3.17494 )
		if( Positive_Money_Flow_Sum <= 3.45187e+07 )
			if( Negative_Money_Flow <= 2.45987e+06 )
				if( Negative_Money_Flow <= 2.00275e+06 )
					if( MFI <= 66.1972 )
						if( bbm <= 0.029995 )
							if( bbm <= 0.01735 )
								if( bbm <= 0.017163 )
									ret := -0.036111
								if( bbm > 0.017163 )
									ret := 0.722222 // buy
							if( bbm > 0.01735 )
								if( Typical_Price <= 5.84916 )
									ret := -0.229877
								if( Typical_Price > 5.84916 )
									ret := -0.007937
						if( bbm > 0.029995 )
							if( Positive_Money_Flow_Sum <= 9.96535e+06 )
								if( bullPower <= -0.118509 )
									ret := 0.107559
								if( bullPower > -0.118509 )
									ret := 0.009664
							if( Positive_Money_Flow_Sum > 9.96535e+06 )
								if( MFI <= 56.8264 )
									ret := -0.071921
								if( MFI > 56.8264 )
									ret := 0.036087
					if( MFI > 66.1972 )
						if( MFI_High <= -12.276 )
							if( Negative_Money_Flow <= 900753 )
								if( Negative_Money_Flow <= 269091 )
									ret := 0.125496
								if( Negative_Money_Flow > 269091 )
									ret := -0.170833
							if( Negative_Money_Flow > 900753 )
								if( bullPower <= 0.347659 )
									ret := 0.237705
								if( bullPower > 0.347659 )
									ret := 0.691729
						if( MFI_High > -12.276 )
							if( Negative_Money_Flow_Sum <= 9.82492e+06 )
								if( bullPower <= 2.34903 )
									ret := 0.042077
								if( bullPower > 2.34903 )
									ret := -0.882353 // sell
							if( Negative_Money_Flow_Sum > 9.82492e+06 )
								if( bearPower <= -0.432173 )
									ret := -0.542857
								if( bearPower > -0.432173 )
									ret := 0.273282
				if( Negative_Money_Flow > 2.00275e+06 )
					if( bearPower <= -0.987473 )
						if( Negative_Money_Flow <= 2.21611e+06 )
							if( Money_Flow_Ratio <= 0.171442 )
								if( bearPower <= -1.18601 )
									ret := -0.461538
								if( bearPower > -1.18601 )
									ret := -0.750000 // sell
							if( Money_Flow_Ratio > 0.171442 )
								if( Negative_Money_Flow_Sum <= 1.76658e+07 )
									ret := 0.640000
								if( Negative_Money_Flow_Sum > 1.76658e+07 )
									ret := -0.187500
						if( Negative_Money_Flow > 2.21611e+06 )
							if( Raw_Money_Flow <= 2.23287e+06 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 2.23287e+06 )
								if( MFI_Low <= -6.80817 )
									ret := 0.866667 // buy
								if( MFI_Low > -6.80817 )
									ret := 0.243902
					if( bearPower > -0.987473 )
						if( Money_Flow_Ratio <= 0.930813 )
							if( MFI_High <= -37.9317 )
								if( Raw_Money_Flow <= 2.35133e+06 )
									ret := -0.247754
								if( Raw_Money_Flow > 2.35133e+06 )
									ret := 0.076503
							if( MFI_High > -37.9317 )
								if( MFI_Low <= 23.3763 )
									ret := -0.642105
								if( MFI_Low > 23.3763 )
									ret := -0.269091
						if( Money_Flow_Ratio > 0.930813 )
							if( bbp <= -0.620983 )
								if( Raw_Money_Flow <= 2.24722e+06 )
									ret := -0.254902
								if( Raw_Money_Flow > 2.24722e+06 )
									ret := -0.744186 // sell
							if( bbp > -0.620983 )
								if( Typical_Price <= 22.8251 )
									ret := -0.319444
								if( Typical_Price > 22.8251 )
									ret := 0.081448
			if( Negative_Money_Flow > 2.45987e+06 )
				if( MFI_Low <= 2.40398 )
					if( bullPower <= -0.680217 )
						if( bullPower <= -1.5559 )
							if( bullPower <= -1.69282 )
								if( bullPower <= -2.09584 )
									ret := 0.888889 // buy
								if( bullPower > -2.09584 )
									ret := 0.281250
							if( bullPower > -1.69282 )
								if( Typical_Price <= 86.4585 )
									ret := -0.263158
								if( Typical_Price > 86.4585 )
									ret := -0.846154 // sell
						if( bullPower > -1.5559 )
							if( Negative_Money_Flow <= 3.36575e+06 )
								if( bearPower <= -1.91541 )
									ret := -0.714286 // sell
								if( bearPower > -1.91541 )
									ret := 0.481481
							if( Negative_Money_Flow > 3.36575e+06 )
								if( Negative_Money_Flow_Sum <= 6.97272e+07 )
									ret := 0.455385
								if( Negative_Money_Flow_Sum > 6.97272e+07 )
									ret := 0.833333 // buy
					if( bullPower > -0.680217 )
						if( MFI <= 21.2167 )
							if( Negative_Money_Flow_Sum <= 4.15199e+07 )
								if( MFI_High <= -75.2958 )
									ret := 0.708333 // buy
								if( MFI_High > -75.2958 )
									ret := -0.018771
							if( Negative_Money_Flow_Sum > 4.15199e+07 )
								if( Typical_Price <= 45.091 )
									ret := 0.759259 // buy
								if( Typical_Price > 45.091 )
									ret := 0.222930
						if( MFI > 21.2167 )
							if( bullPower <= -0.068137 )
								if( Negative_Money_Flow <= 3.16503e+06 )
									ret := 0.866667 // buy
								if( Negative_Money_Flow > 3.16503e+06 )
									ret := 0.289720
							if( bullPower > -0.068137 )
								ret := -0.500000
				if( MFI_Low > 2.40398 )
					if( MFI_High <= -54.8265 )
						if( bbm <= 1.30146 )
							if( MFI_High <= -57.2142 )
								if( MFI_High <= -57.5612 )
									ret := -0.777778 // sell
								if( MFI_High > -57.5612 )
									ret := 0.205128
							if( MFI_High > -57.2142 )
								if( bullPower <= -0.324394 )
									ret := -0.226994
								if( bullPower > -0.324394 )
									ret := -0.514286
						if( bbm > 1.30146 )
							if( Positive_Money_Flow_Sum <= 2.41074e+07 )
								if( MFI <= 24.6578 )
									ret := 0.700000 // buy
								if( MFI > 24.6578 )
									ret := -0.230769
							if( Positive_Money_Flow_Sum > 2.41074e+07 )
								if( Typical_Price <= 84.3094 )
									ret := -0.750000 // sell
								if( Typical_Price > 84.3094 )
									ret := 0.357143
					if( MFI_High > -54.8265 )
						if( Positive_Money_Flow_Sum <= 1.27153e+07 )
							if( MFI <= 28.5161 )
								if( bbp <= -2.68463 )
									ret := -0.655172
								if( bbp > -2.68463 )
									ret := 0.052023
							if( MFI > 28.5161 )
								if( MFI_High <= -50.2806 )
									ret := 0.500000
								if( MFI_High > -50.2806 )
									ret := 0.197183
						if( Positive_Money_Flow_Sum > 1.27153e+07 )
							if( bbp <= -3.60451 )
								if( MFI <= 36.6275 )
									ret := 0.631206
								if( MFI > 36.6275 )
									ret := -0.357143
							if( bbp > -3.60451 )
								if( Raw_Money_Flow <= 2.59088e+06 )
									ret := 0.284281
								if( Raw_Money_Flow > 2.59088e+06 )
									ret := -0.022103
		if( Positive_Money_Flow_Sum > 3.45187e+07 )
			if( MFI_High <= -42.6862 )
				if( Money_Flow_Ratio <= 0.308429 )
					if( Money_Flow_Ratio <= 0.251715 )
						ret := -0.333333
					if( Money_Flow_Ratio > 0.251715 )
						if( Typical_Price <= 56.4105 )
							ret := -0.083333
						if( Typical_Price > 56.4105 )
							if( bbm <= 1.54637 )
								ret := 0.333333
							if( bbm > 1.54637 )
								if( bullPower <= -0.420198 )
									ret := 0.857143 // buy
								if( bullPower > -0.420198 )
									ret := 1.000000 // buy
				if( Money_Flow_Ratio > 0.308429 )
					if( Negative_Money_Flow <= 4.81861e+06 )
						if( BBPower_Color <= 0.5 )
							if( bbp <= -2.23202 )
								if( Positive_Money_Flow_Sum <= 4.04592e+07 )
									ret := 0.047619
								if( Positive_Money_Flow_Sum > 4.04592e+07 )
									ret := -0.500000
							if( bbp > -2.23202 )
								if( Positive_Money_Flow_Sum <= 4.393e+07 )
									ret := -0.570776
								if( Positive_Money_Flow_Sum > 4.393e+07 )
									ret := -0.872222 // sell
						if( BBPower_Color > 0.5 )
							if( bbm <= 0.79 )
								ret := 0.785714 // buy
							if( bbm > 0.79 )
								if( MFI_Low <= 13.6053 )
									ret := -0.812500 // sell
								if( MFI_Low > 13.6053 )
									ret := -0.333333
					if( Negative_Money_Flow > 4.81861e+06 )
						if( Money_Flow_Ratio <= 0.424989 )
							if( MFI_Low <= 9.36357 )
								if( bearPower <= -2.36666 )
									ret := 0.033333
								if( bearPower > -2.36666 )
									ret := -0.415385
							if( MFI_Low > 9.36357 )
								ret := -1.000000 // sell
						if( Money_Flow_Ratio > 0.424989 )
							if( bbp <= -2.45078 )
								if( Raw_Money_Flow <= 7.05774e+06 )
									ret := 0.307692
								if( Raw_Money_Flow > 7.05774e+06 )
									ret := 0.835616 // buy
							if( bbp > -2.45078 )
								if( bbp <= -1.68565 )
									ret := -0.096774
								if( bbp > -1.68565 )
									ret := -0.601399
			if( MFI_High > -42.6862 )
				if( Raw_Money_Flow <= 4.44928e+07 )
					if( Positive_Money_Flow_Sum <= 6.34252e+07 )
						if( Raw_Money_Flow <= 1.8522e+07 )
							if( bearPower <= 0.56105 )
								if( Raw_Money_Flow <= 8.15358e+06 )
									ret := -0.118199
								if( Raw_Money_Flow > 8.15358e+06 )
									ret := -0.260910
							if( bearPower > 0.56105 )
								if( MFI <= 86.3282 )
									ret := 0.110459
								if( MFI > 86.3282 )
									ret := -0.431138
						if( Raw_Money_Flow > 1.8522e+07 )
							if( Typical_Price <= 78.7498 )
								if( Positive_Money_Flow <= 1.95535e+07 )
									ret := 0.176471
								if( Positive_Money_Flow > 1.95535e+07 )
									ret := 0.875000 // buy
							if( Typical_Price > 78.7498 )
								if( Positive_Money_Flow <= 2.33001e+07 )
									ret := -0.444444
								if( Positive_Money_Flow > 2.33001e+07 )
									ret := 0.076923
					if( Positive_Money_Flow_Sum > 6.34252e+07 )
						if( Positive_Money_Flow_Sum <= 9.229e+07 )
							if( Negative_Money_Flow_Sum <= 1.1317e+07 )
								if( bbm <= 0.904796 )
									ret := -0.511111
								if( bbm > 0.904796 )
									ret := -0.836066 // sell
							if( Negative_Money_Flow_Sum > 1.1317e+07 )
								if( Typical_Price <= 42.691 )
									ret := 0.319672
								if( Typical_Price > 42.691 )
									ret := 0.058733
						if( Positive_Money_Flow_Sum > 9.229e+07 )
							if( bearPower <= 2.56378 )
								if( bbm <= 1.9716 )
									ret := -0.023157
								if( bbm > 1.9716 )
									ret := -0.205769
							if( bearPower > 2.56378 )
								if( bbm <= 1.48503 )
									ret := -0.222222
								if( bbm > 1.48503 )
									ret := -0.792683 // sell
				if( Raw_Money_Flow > 4.44928e+07 )
					if( Negative_Money_Flow_Sum <= 3.53035e+07 )
						ret := -0.090909
					if( Negative_Money_Flow_Sum > 3.53035e+07 )
						if( bbp <= 9.48603 )
							if( Positive_Money_Flow_Sum <= 1.83206e+08 )
								ret := -0.947368 // sell
							if( Positive_Money_Flow_Sum > 1.83206e+08 )
								ret := -0.538462
						if( bbp > 9.48603 )
							ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_AVAXUSDT_30Min_0a5c1225(bullPower, bbp, bearPower, bbm, BBPower_Color, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


