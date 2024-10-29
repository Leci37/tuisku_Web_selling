//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: LTCUSDT_30Min_1M00_8f7ad2ab Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_30Min_1M00_8f7ad2ab", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_30Min_8f7ad2ab(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Negative_Money_Flow <= 1.90748e+06 )
		if( Negative_Money_Flow_Sum <= 1.68617e+08 )
			if( Positive_Money_Flow_Sum <= 4.21983e+06 )
				if( Positive_Money_Flow <= 389305 )
					if( Negative_Money_Flow <= 133446 )
						if( Money_Flow_Ratio <= 0.272142 )
							if( Raw_Money_Flow <= 714042 )
								if( Positive_Money_Flow <= 309077 )
									ret := -0.462766
								if( Positive_Money_Flow > 309077 )
									ret := -0.061728
							if( Raw_Money_Flow > 714042 )
								ret := 0.666667
						if( Money_Flow_Ratio > 0.272142 )
							if( Negative_Money_Flow_Sum <= 4.57499e+06 )
								if( MFI_Low <= 51.7173 )
									ret := -0.065826
								if( MFI_Low > 51.7173 )
									ret := 0.061972
							if( Negative_Money_Flow_Sum > 4.57499e+06 )
								if( Positive_Money_Flow_Sum <= 2.58138e+06 )
									ret := 0.370000
								if( Positive_Money_Flow_Sum > 2.58138e+06 )
									ret := -0.033727
					if( Negative_Money_Flow > 133446 )
						if( Raw_Money_Flow <= 1.47191e+06 )
							if( Money_Flow_Ratio <= 0.213256 )
								if( Raw_Money_Flow <= 799334 )
									ret := -0.008798
								if( Raw_Money_Flow > 799334 )
									ret := -0.249180
							if( Money_Flow_Ratio > 0.213256 )
								if( Negative_Money_Flow_Sum <= 5.65988e+06 )
									ret := 0.023032
								if( Negative_Money_Flow_Sum > 5.65988e+06 )
									ret := 0.100592
						if( Raw_Money_Flow > 1.47191e+06 )
							if( Positive_Money_Flow_Sum <= 3.812e+06 )
								if( Positive_Money_Flow_Sum <= 3.35629e+06 )
									ret := -0.162534
								if( Positive_Money_Flow_Sum > 3.35629e+06 )
									ret := 0.106557
							if( Positive_Money_Flow_Sum > 3.812e+06 )
								if( Typical_Price <= 96.2709 )
									ret := -0.162791
								if( Typical_Price > 96.2709 )
									ret := -0.974359 // sell
				if( Positive_Money_Flow > 389305 )
					if( Money_Flow_Ratio <= 2.1472 )
						if( Negative_Money_Flow_Sum <= 1.05135e+07 )
							if( MFI_High <= -57.9876 )
								if( Positive_Money_Flow_Sum <= 1.4002e+06 )
									ret := -0.048780
								if( Positive_Money_Flow_Sum > 1.4002e+06 )
									ret := -0.460000
							if( MFI_High > -57.9876 )
								if( MFI_High <= -44.669 )
									ret := -0.031794
								if( MFI_High > -44.669 )
									ret := 0.097930
						if( Negative_Money_Flow_Sum > 1.05135e+07 )
							if( Negative_Money_Flow_Sum <= 3.34083e+07 )
								if( Typical_Price <= 52.0967 )
									ret := 0.711111 // buy
								if( Typical_Price > 52.0967 )
									ret := 0.229117
							if( Negative_Money_Flow_Sum > 3.34083e+07 )
								ret := -0.636364
					if( Money_Flow_Ratio > 2.1472 )
						if( Negative_Money_Flow_Sum <= 1.83548e+06 )
							if( Positive_Money_Flow <= 710576 )
								if( Positive_Money_Flow_Sum <= 2.84281e+06 )
									ret := 0.483516
								if( Positive_Money_Flow_Sum > 2.84281e+06 )
									ret := 0.041322
							if( Positive_Money_Flow > 710576 )
								if( Positive_Money_Flow_Sum <= 3.57727e+06 )
									ret := 0.767857 // buy
								if( Positive_Money_Flow_Sum > 3.57727e+06 )
									ret := 0.324324
						if( Negative_Money_Flow_Sum > 1.83548e+06 )
							if( Positive_Money_Flow_Sum <= 4.15798e+06 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 4.15798e+06 )
								ret := 0.727273 // buy
			if( Positive_Money_Flow_Sum > 4.21983e+06 )
				if( Negative_Money_Flow <= 613523 )
					if( Negative_Money_Flow_Sum <= 1.47397e+08 )
						if( MFI <= 12.656 )
							if( MFI <= 12.0212 )
								ret := 0.250000
							if( MFI > 12.0212 )
								ret := 0.956522 // buy
						if( MFI > 12.656 )
							if( MFI_Low <= 69.4203 )
								if( Raw_Money_Flow <= 7.72209e+07 )
									ret := -0.047767
								if( Raw_Money_Flow > 7.72209e+07 )
									ret := -0.826087 // sell
							if( MFI_Low > 69.4203 )
								if( Positive_Money_Flow_Sum <= 1.01306e+07 )
									ret := -0.300000
								if( Positive_Money_Flow_Sum > 1.01306e+07 )
									ret := 0.155844
					if( Negative_Money_Flow_Sum > 1.47397e+08 )
						if( Typical_Price <= 343.406 )
							if( Money_Flow_Ratio <= 0.997272 )
								if( MFI_Low <= 10.3639 )
									ret := 0.818182 // buy
								if( MFI_Low > 10.3639 )
									ret := 0.987805 // buy
							if( Money_Flow_Ratio > 0.997272 )
								ret := 0.833333 // buy
						if( Typical_Price > 343.406 )
							ret := -0.454545
				if( Negative_Money_Flow > 613523 )
					if( Money_Flow_Ratio <= 3.64958 )
						if( Negative_Money_Flow_Sum <= 2.91704e+07 )
							if( Negative_Money_Flow_Sum <= 1.65216e+07 )
								if( Typical_Price <= 79.7489 )
									ret := 0.070815
								if( Typical_Price > 79.7489 )
									ret := -0.049827
							if( Negative_Money_Flow_Sum > 1.65216e+07 )
								if( MFI_Low <= 24.6548 )
									ret := 0.016308
								if( MFI_Low > 24.6548 )
									ret := 0.427646
						if( Negative_Money_Flow_Sum > 2.91704e+07 )
							if( Typical_Price <= 237.95 )
								if( Positive_Money_Flow_Sum <= 4.61206e+07 )
									ret := -0.211045
								if( Positive_Money_Flow_Sum > 4.61206e+07 )
									ret := -0.837838 // sell
							if( Typical_Price > 237.95 )
								ret := 0.588235
					if( Money_Flow_Ratio > 3.64958 )
						if( Negative_Money_Flow_Sum <= 2.44965e+06 )
							if( MFI <= 83.3888 )
								if( MFI <= 81.7476 )
									ret := 0.075000
								if( MFI > 81.7476 )
									ret := -0.578947
							if( MFI > 83.3888 )
								if( Positive_Money_Flow_Sum <= 9.5925e+06 )
									ret := 0.500000
								if( Positive_Money_Flow_Sum > 9.5925e+06 )
									ret := 0.083333
						if( Negative_Money_Flow_Sum > 2.44965e+06 )
							if( Typical_Price <= 151.172 )
								if( Typical_Price <= 101.45 )
									ret := 0.282723
								if( Typical_Price > 101.45 )
									ret := 0.608696
							if( Typical_Price > 151.172 )
								if( MFI <= 84.3351 )
									ret := -0.083333
								if( MFI > 84.3351 )
									ret := -0.666667
		if( Negative_Money_Flow_Sum > 1.68617e+08 )
			if( Positive_Money_Flow <= 2.2414e+07 )
				if( Negative_Money_Flow_Sum <= 3.14969e+08 )
					if( MFI_Low <= 18.5217 )
						if( Positive_Money_Flow_Sum <= 3.84693e+07 )
							ret := 0.090909
						if( Positive_Money_Flow_Sum > 3.84693e+07 )
							if( Positive_Money_Flow <= 1.45571e+07 )
								if( Money_Flow_Ratio <= 0.302743 )
									ret := -0.875000 // sell
								if( Money_Flow_Ratio > 0.302743 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow > 1.45571e+07 )
								if( MFI_Low <= 6.93863 )
									ret := -0.111111
								if( MFI_Low > 6.93863 )
									ret := -0.843137 // sell
					if( MFI_Low > 18.5217 )
						if( MFI_High <= -32.0052 )
							if( Negative_Money_Flow_Sum <= 1.80029e+08 )
								if( Raw_Money_Flow <= 1.34026e+07 )
									ret := 0.846154 // buy
								if( Raw_Money_Flow > 1.34026e+07 )
									ret := -0.437500
							if( Negative_Money_Flow_Sum > 1.80029e+08 )
								ret := -0.750000 // sell
						if( MFI_High > -32.0052 )
							ret := -1.000000 // sell
				if( Negative_Money_Flow_Sum > 3.14969e+08 )
					ret := 0.133333
			if( Positive_Money_Flow > 2.2414e+07 )
				if( Positive_Money_Flow_Sum <= 2.34726e+08 )
					if( Money_Flow_Ratio <= 0.360329 )
						ret := 0.818182 // buy
					if( Money_Flow_Ratio > 0.360329 )
						if( MFI <= 36.1784 )
							if( Raw_Money_Flow <= 3.64635e+07 )
								ret := -0.789474 // sell
							if( Raw_Money_Flow > 3.64635e+07 )
								ret := 0.300000
						if( MFI > 36.1784 )
							if( Negative_Money_Flow_Sum <= 2.13687e+08 )
								ret := -0.307692
							if( Negative_Money_Flow_Sum > 2.13687e+08 )
								ret := 0.750000 // buy
				if( Positive_Money_Flow_Sum > 2.34726e+08 )
					ret := -0.875000 // sell
	if( Negative_Money_Flow > 1.90748e+06 )
		if( Negative_Money_Flow <= 2.89851e+07 )
			if( Negative_Money_Flow <= 1.39101e+07 )
				if( Negative_Money_Flow_Sum <= 6.52183e+07 )
					if( Typical_Price <= 61.8559 )
						if( MFI <= 26.5221 )
							if( Negative_Money_Flow_Sum <= 9.70746e+06 )
								if( Money_Flow_Ratio <= 0.194025 )
									ret := 0.000000
								if( Money_Flow_Ratio > 0.194025 )
									ret := 0.382353
							if( Negative_Money_Flow_Sum > 9.70746e+06 )
								if( Negative_Money_Flow <= 2.10713e+06 )
									ret := 0.192308
								if( Negative_Money_Flow > 2.10713e+06 )
									ret := 0.790909 // buy
						if( MFI > 26.5221 )
							if( MFI <= 34.3706 )
								if( MFI_High <= -46.6367 )
									ret := 0.064103
								if( MFI_High > -46.6367 )
									ret := -0.900000 // sell
							if( MFI > 34.3706 )
								if( Negative_Money_Flow_Sum <= 1.66269e+07 )
									ret := 0.208589
								if( Negative_Money_Flow_Sum > 1.66269e+07 )
									ret := 0.888889 // buy
					if( Typical_Price > 61.8559 )
						if( Negative_Money_Flow <= 5.20956e+06 )
							if( Positive_Money_Flow_Sum <= 1.77079e+07 )
								if( Negative_Money_Flow_Sum <= 2.44869e+07 )
									ret := 0.095516
								if( Negative_Money_Flow_Sum > 2.44869e+07 )
									ret := 0.228489
							if( Positive_Money_Flow_Sum > 1.77079e+07 )
								if( Typical_Price <= 116.846 )
									ret := 0.184799
								if( Typical_Price > 116.846 )
									ret := -0.026558
						if( Negative_Money_Flow > 5.20956e+06 )
							if( Typical_Price <= 274.444 )
								if( MFI_Low <= 7.96652 )
									ret := -0.016484
								if( MFI_Low > 7.96652 )
									ret := 0.230593
							if( Typical_Price > 274.444 )
								if( Raw_Money_Flow <= 8.7633e+06 )
									ret := -0.050000
								if( Raw_Money_Flow > 8.7633e+06 )
									ret := -0.534247
				if( Negative_Money_Flow_Sum > 6.52183e+07 )
					if( Money_Flow_Ratio <= 0.846461 )
						if( MFI_High <= -35.2399 )
							if( Typical_Price <= 166.151 )
								if( Raw_Money_Flow <= 1.01542e+07 )
									ret := 0.256506
								if( Raw_Money_Flow > 1.01542e+07 )
									ret := 0.813333 // buy
							if( Typical_Price > 166.151 )
								if( Negative_Money_Flow_Sum <= 6.86305e+07 )
									ret := -0.524194
								if( Negative_Money_Flow_Sum > 6.86305e+07 )
									ret := -0.050725
						if( MFI_High > -35.2399 )
							if( MFI_Low <= 24.9349 )
								ret := 1.000000 // buy
							if( MFI_Low > 24.9349 )
								if( Money_Flow_Ratio <= 0.832263 )
									ret := 0.384615
								if( Money_Flow_Ratio > 0.832263 )
									ret := 0.916667 // buy
					if( Money_Flow_Ratio > 0.846461 )
						if( MFI_High <= -26.1785 )
							if( MFI_Low <= 29.2804 )
								if( MFI_Low <= 29.116 )
									ret := -0.397436
								if( MFI_Low > 29.116 )
									ret := 0.692308
							if( MFI_Low > 29.2804 )
								if( Negative_Money_Flow <= 8.47627e+06 )
									ret := -0.930233 // sell
								if( Negative_Money_Flow > 8.47627e+06 )
									ret := -0.720930 // sell
						if( MFI_High > -26.1785 )
							if( MFI_High <= -3.90211 )
								if( Negative_Money_Flow <= 4.38398e+06 )
									ret := -0.866667 // sell
								if( Negative_Money_Flow > 4.38398e+06 )
									ret := 0.071066
							if( MFI_High > -3.90211 )
								if( MFI_Low <= 59.3327 )
									ret := -0.818182 // sell
								if( MFI_Low > 59.3327 )
									ret := -1.000000 // sell
			if( Negative_Money_Flow > 1.39101e+07 )
				if( Typical_Price <= 356.455 )
					if( Typical_Price <= 173.415 )
						if( MFI_Low <= 15.6203 )
							if( Negative_Money_Flow <= 1.60985e+07 )
								if( MFI_High <= -68.2725 )
									ret := -0.761905 // sell
								if( MFI_High > -68.2725 )
									ret := 0.546667
							if( Negative_Money_Flow > 1.60985e+07 )
								if( Positive_Money_Flow_Sum <= 3.15395e+07 )
									ret := 0.902913 // buy
								if( Positive_Money_Flow_Sum > 3.15395e+07 )
									ret := 0.666667
						if( MFI_Low > 15.6203 )
							if( MFI <= 40.4541 )
								ret := -0.733333 // sell
							if( MFI > 40.4541 )
								if( Positive_Money_Flow_Sum <= 4.2786e+07 )
									ret := -0.153846
								if( Positive_Money_Flow_Sum > 4.2786e+07 )
									ret := 0.557692
					if( Typical_Price > 173.415 )
						if( Raw_Money_Flow <= 1.7188e+07 )
							if( MFI_High <= -47.4544 )
								if( Raw_Money_Flow <= 1.48895e+07 )
									ret := 0.285714
								if( Raw_Money_Flow > 1.48895e+07 )
									ret := 0.775281 // buy
							if( MFI_High > -47.4544 )
								if( MFI_Low <= 51.0355 )
									ret := 0.253521
								if( MFI_Low > 51.0355 )
									ret := 0.750000 // buy
						if( Raw_Money_Flow > 1.7188e+07 )
							if( MFI_Low <= 41.8757 )
								if( MFI <= 42.1078 )
									ret := 0.181818
								if( MFI > 42.1078 )
									ret := -0.447059
							if( MFI_Low > 41.8757 )
								if( MFI_Low <= 46.0035 )
									ret := 0.909091 // buy
								if( MFI_Low > 46.0035 )
									ret := 0.375000
				if( Typical_Price > 356.455 )
					if( Money_Flow_Ratio <= 1.46142 )
						if( Negative_Money_Flow <= 1.73101e+07 )
							ret := -0.444444
						if( Negative_Money_Flow > 1.73101e+07 )
							if( Typical_Price <= 373.443 )
								if( MFI <= 34.3167 )
									ret := -0.846154 // sell
								if( MFI > 34.3167 )
									ret := -0.818182 // sell
							if( Typical_Price > 373.443 )
								ret := -1.000000 // sell
					if( Money_Flow_Ratio > 1.46142 )
						ret := -0.315789
		if( Negative_Money_Flow > 2.89851e+07 )
			if( Positive_Money_Flow_Sum <= 1.04527e+08 )
				if( MFI <= 23.9958 )
					if( Money_Flow_Ratio <= 0.145597 )
						if( MFI <= 9.1846 )
							ret := -1.000000 // sell
						if( MFI > 9.1846 )
							ret := -0.800000 // sell
					if( Money_Flow_Ratio > 0.145597 )
						if( Negative_Money_Flow <= 3.44613e+07 )
							if( MFI_Low <= -2.68997 )
								ret := 0.882353 // buy
							if( MFI_Low > -2.68997 )
								ret := -0.833333 // sell
						if( Negative_Money_Flow > 3.44613e+07 )
							ret := 0.947368 // buy
				if( MFI > 23.9958 )
					if( MFI <= 32.8606 )
						if( Negative_Money_Flow_Sum <= 2.28093e+08 )
							if( MFI <= 25.6921 )
								ret := -0.785714 // sell
							if( MFI > 25.6921 )
								if( MFI_High <= -49.4904 )
									ret := -1.000000 // sell
								if( MFI_High > -49.4904 )
									ret := -0.894737 // sell
						if( Negative_Money_Flow_Sum > 2.28093e+08 )
							ret := 0.100000
					if( MFI > 32.8606 )
						if( Typical_Price <= 281.111 )
							ret := 0.700000 // buy
						if( Typical_Price > 281.111 )
							ret := -0.894737 // sell
			if( Positive_Money_Flow_Sum > 1.04527e+08 )
				if( Positive_Money_Flow_Sum <= 3.39045e+08 )
					if( Negative_Money_Flow <= 3.24529e+07 )
						if( MFI <= 54.4122 )
							ret := 0.636364
						if( MFI > 54.4122 )
							ret := -0.555556
					if( Negative_Money_Flow > 3.24529e+07 )
						if( MFI_Low <= 19.7656 )
							ret := 1.000000 // buy
						if( MFI_Low > 19.7656 )
							if( Money_Flow_Ratio <= 0.788198 )
								ret := -0.250000
							if( Money_Flow_Ratio > 0.788198 )
								ret := 0.894737 // buy
				if( Positive_Money_Flow_Sum > 3.39045e+08 )
					if( Negative_Money_Flow_Sum <= 3.6565e+08 )
						ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 3.6565e+08 )
						ret := -0.700000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_LTCUSDT_30Min_8f7ad2ab(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


