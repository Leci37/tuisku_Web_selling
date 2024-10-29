//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: UNIUSDT_15Min_1SQU_a2a67ae2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_15Min_1SQU_a2a67ae2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_15Min_a2a67ae2(lowerBB, noSqzInt, avgHighLow, rangema, sqzOffInt, upperKC, ma, basis, val, sqzOnInt, dev, priceRange, lowerKC, upperBB)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( lowerKC <= 6.03576 )
		if( lowerBB <= 5.98365 )
			if( upperKC <= 3.67733 )
				if( val <= 0.014174 )
					if( rangema <= 0.05725 )
						if( upperKC <= 3.66636 )
							ret := 0.578947
						if( upperKC > 3.66636 )
							ret := 1.000000 // buy
					if( rangema > 0.05725 )
						if( val <= 0.008995 )
							ret := 1.000000 // buy
						if( val > 0.008995 )
							ret := 0.846154 // buy
				if( val > 0.014174 )
					ret := 0.076923
			if( upperKC > 3.67733 )
				if( val <= -0.007583 )
					if( avgHighLow <= 5.14669 )
						if( lowerBB <= 4.91947 )
							if( upperBB <= 4.76023 )
								if( ma <= 4.48335 )
									ret := 0.095563
								if( ma > 4.48335 )
									ret := 0.783019 // buy
							if( upperBB > 4.76023 )
								if( val <= -0.016886 )
									ret := -0.633333
								if( val > -0.016886 )
									ret := 0.206731
						if( lowerBB > 4.91947 )
							if( upperKC <= 5.21338 )
								if( avgHighLow <= 5.0625 )
									ret := 0.962264 // buy
								if( avgHighLow > 5.0625 )
									ret := 0.786885 // buy
							if( upperKC > 5.21338 )
								if( upperBB <= 5.20554 )
									ret := 0.360000
								if( upperBB > 5.20554 )
									ret := 0.863636 // buy
					if( avgHighLow > 5.14669 )
						if( lowerBB <= 5.10483 )
							if( basis <= 5.2427 )
								if( dev <= 0.085347 )
									ret := -0.826087 // sell
								if( dev > 0.085347 )
									ret := 0.333333
							if( basis > 5.2427 )
								if( val <= -0.011544 )
									ret := -0.954545 // sell
								if( val > -0.011544 )
									ret := -0.764706 // sell
						if( lowerBB > 5.10483 )
							if( upperKC <= 5.385 )
								if( upperKC <= 5.29429 )
									ret := -0.032258
								if( upperKC > 5.29429 )
									ret := 0.603604
							if( upperKC > 5.385 )
								if( rangema <= 0.081527 )
									ret := 0.027200
								if( rangema > 0.081527 )
									ret := 0.313776
				if( val > -0.007583 )
					if( priceRange <= 0.025042 )
						if( rangema <= 0.01602 )
							if( upperBB <= 4.55761 )
								if( avgHighLow <= 4.51638 )
									ret := 0.080863
								if( avgHighLow > 4.51638 )
									ret := 0.640000
							if( upperBB > 4.55761 )
								if( basis <= 4.58102 )
									ret := -0.330049
								if( basis > 4.58102 )
									ret := -0.020737
						if( rangema > 0.01602 )
							if( upperBB <= 4.67776 )
								if( val <= -0.002655 )
									ret := -0.244048
								if( val > -0.002655 )
									ret := -0.084754
							if( upperBB > 4.67776 )
								if( upperKC <= 4.83267 )
									ret := 0.161710
								if( upperKC > 4.83267 )
									ret := -0.023096
					if( priceRange > 0.025042 )
						if( ma <= 5.90557 )
							if( lowerBB <= 5.8345 )
								if( upperBB <= 4.07057 )
									ret := -0.124601
								if( upperBB > 4.07057 )
									ret := 0.074759
							if( lowerBB > 5.8345 )
								if( rangema <= 0.03404 )
									ret := 0.166052
								if( rangema > 0.03404 )
									ret := 0.669767
						if( ma > 5.90557 )
							if( avgHighLow <= 5.90067 )
								if( upperKC <= 5.96534 )
									ret := 0.093023
								if( upperKC > 5.96534 )
									ret := -0.623077
							if( avgHighLow > 5.90067 )
								if( rangema <= 0.067549 )
									ret := 0.024787
								if( rangema > 0.067549 )
									ret := -0.274662
		if( lowerBB > 5.98365 )
			if( ma <= 6.02029 )
				if( priceRange <= 0.016065 )
					if( upperBB <= 6.03641 )
						ret := 0.000000
					if( upperBB > 6.03641 )
						ret := 0.200000
				if( priceRange > 0.016065 )
					if( upperKC <= 6.04793 )
						if( avgHighLow <= 6.01075 )
							if( avgHighLow <= 6.0086 )
								ret := -0.111111
							if( avgHighLow > 6.0086 )
								ret := 0.083333
						if( avgHighLow > 6.01075 )
							if( val <= 0.001849 )
								ret := -0.727273 // sell
							if( val > 0.001849 )
								ret := -1.000000 // sell
					if( upperKC > 6.04793 )
						if( upperBB <= 6.03584 )
							if( ma <= 6.01025 )
								ret := 0.750000 // buy
							if( ma > 6.01025 )
								if( lowerBB <= 5.99251 )
									ret := 0.300000
								if( lowerBB > 5.99251 )
									ret := 0.000000
						if( upperBB > 6.03584 )
							if( val <= -0.002229 )
								ret := 0.000000
							if( val > -0.002229 )
								if( upperKC <= 6.05334 )
									ret := 0.000000
								if( upperKC > 6.05334 )
									ret := -1.000000 // sell
			if( ma > 6.02029 )
				if( ma <= 6.12824 )
					if( basis <= 6.10591 )
						if( lowerKC <= 6.00612 )
							if( priceRange <= 0.024215 )
								if( upperBB <= 6.08299 )
									ret := 0.067568
								if( upperBB > 6.08299 )
									ret := 0.547619
							if( priceRange > 0.024215 )
								if( rangema <= 0.08868 )
									ret := 0.478814
								if( rangema > 0.08868 )
									ret := -0.631579
						if( lowerKC > 6.00612 )
							if( lowerKC <= 6.03156 )
								if( avgHighLow <= 6.10525 )
									ret := 0.231106
								if( avgHighLow > 6.10525 )
									ret := -0.617647
							if( lowerKC > 6.03156 )
								if( upperBB <= 6.14624 )
									ret := 0.237624
								if( upperBB > 6.14624 )
									ret := -0.417722
					if( basis > 6.10591 )
						if( priceRange <= 0.0319 )
							ret := 1.000000 // buy
						if( priceRange > 0.0319 )
							if( upperBB <= 6.22751 )
								if( avgHighLow <= 6.10942 )
									ret := 0.897959 // buy
								if( avgHighLow > 6.10942 )
									ret := 0.638298
							if( upperBB > 6.22751 )
								if( rangema <= 0.0673 )
									ret := 0.636364
								if( rangema > 0.0673 )
									ret := -0.166667
				if( ma > 6.12824 )
					if( rangema <= 0.087275 )
						if( priceRange <= 0.0562 )
							ret := -1.000000 // sell
						if( priceRange > 0.0562 )
							if( rangema <= 0.077225 )
								ret := -0.454545
							if( rangema > 0.077225 )
								ret := -0.937500 // sell
					if( rangema > 0.087275 )
						ret := 0.700000 // buy
	if( lowerKC > 6.03576 )
		if( avgHighLow <= 7.11495 )
			if( upperKC <= 7.13392 )
				if( upperKC <= 6.76965 )
					if( lowerBB <= 6.59561 )
						if( basis <= 6.60351 )
							if( lowerBB <= 5.947 )
								if( basis <= 6.1651 )
									ret := 0.923077 // buy
								if( basis > 6.1651 )
									ret := 0.117647
							if( lowerBB > 5.947 )
								if( ma <= 6.55865 )
									ret := -0.017967
								if( ma > 6.55865 )
									ret := -0.157933
						if( basis > 6.60351 )
							if( lowerKC <= 6.59028 )
								if( val <= 0.002423 )
									ret := 0.295522
								if( val > 0.002423 )
									ret := -0.097852
							if( lowerKC > 6.59028 )
								if( val <= -0.005308 )
									ret := 0.275862
								if( val > -0.005308 )
									ret := -0.189591
					if( lowerBB > 6.59561 )
						if( avgHighLow <= 6.68058 )
							if( lowerKC <= 6.62373 )
								if( dev <= 0.053435 )
									ret := -0.281879
								if( dev > 0.053435 )
									ret := 0.024793
							if( lowerKC > 6.62373 )
								if( lowerKC <= 6.63094 )
									ret := 0.561644
								if( lowerKC > 6.63094 )
									ret := 0.169355
						if( avgHighLow > 6.68058 )
							if( rangema <= 0.024325 )
								if( sqzOnInt <= 0.5 )
									ret := -0.054054
								if( sqzOnInt > 0.5 )
									ret := 0.274510
							if( rangema > 0.024325 )
								if( priceRange <= 0.023649 )
									ret := -0.222222
								if( priceRange > 0.023649 )
									ret := -0.615752
				if( upperKC > 6.76965 )
					if( val <= 0.011771 )
						if( val <= -0.013012 )
							if( lowerBB <= 6.86905 )
								if( lowerBB <= 6.51837 )
									ret := 0.166667
								if( lowerBB > 6.51837 )
									ret := 0.623762
							if( lowerBB > 6.86905 )
								ret := -0.357143
						if( val > -0.013012 )
							if( basis <= 6.7887 )
								if( upperKC <= 6.87125 )
									ret := 0.178063
								if( upperKC > 6.87125 )
									ret := -0.172535
							if( basis > 6.7887 )
								if( basis <= 6.81803 )
									ret := -0.121839
								if( basis > 6.81803 )
									ret := 0.004456
					if( val > 0.011771 )
						if( val <= 0.06204 )
							if( lowerKC <= 6.85574 )
								if( lowerBB <= 6.72326 )
									ret := -0.354545
								if( lowerBB > 6.72326 )
									ret := -0.858333 // sell
							if( lowerKC > 6.85574 )
								if( avgHighLow <= 6.939 )
									ret := 0.777778 // buy
								if( avgHighLow > 6.939 )
									ret := -0.163265
						if( val > 0.06204 )
							ret := 1.000000 // buy
			if( upperKC > 7.13392 )
				if( val <= -0.003313 )
					if( basis <= 7.19975 )
						if( rangema <= 0.051344 )
							if( lowerKC <= 7.02506 )
								if( rangema <= 0.047 )
									ret := 0.896552 // buy
								if( rangema > 0.047 )
									ret := -0.333333
							if( lowerKC > 7.02506 )
								if( upperBB <= 7.15502 )
									ret := 0.600000
								if( upperBB > 7.15502 )
									ret := 0.000000
						if( rangema > 0.051344 )
							if( upperKC <= 7.22952 )
								if( priceRange <= 0.046266 )
									ret := 0.733333 // buy
								if( priceRange > 0.046266 )
									ret := 0.452830
							if( upperKC > 7.22952 )
								if( basis <= 7.06159 )
									ret := 0.518519
								if( basis > 7.06159 )
									ret := 0.900901 // buy
					if( basis > 7.19975 )
						if( avgHighLow <= 6.98088 )
							ret := -0.857143 // sell
						if( avgHighLow > 6.98088 )
							ret := 0.400000
				if( val > -0.003313 )
					if( lowerBB <= 7.0149 )
						if( dev <= 0.059579 )
							if( ma <= 7.03825 )
								ret := -0.600000
							if( ma > 7.03825 )
								ret := -1.000000 // sell
						if( dev > 0.059579 )
							if( val <= 0.006857 )
								if( upperKC <= 7.16283 )
									ret := 0.670270
								if( upperKC > 7.16283 )
									ret := 0.256410
							if( val > 0.006857 )
								if( lowerKC <= 6.91891 )
									ret := 0.602564
								if( lowerKC > 6.91891 )
									ret := -0.082840
					if( lowerBB > 7.0149 )
						if( val <= 0.007163 )
							if( ma <= 7.09064 )
								if( avgHighLow <= 7.08075 )
									ret := -0.228571
								if( avgHighLow > 7.08075 )
									ret := 0.516667
							if( ma > 7.09064 )
								if( lowerKC <= 7.0537 )
									ret := -0.370253
								if( lowerKC > 7.0537 )
									ret := 0.320000
						if( val > 0.007163 )
							if( lowerKC <= 7.03906 )
								if( upperKC <= 7.13955 )
									ret := 0.300000
								if( upperKC > 7.13955 )
									ret := 0.884615 // buy
							if( lowerKC > 7.03906 )
								ret := 0.000000
		if( avgHighLow > 7.11495 )
			if( basis <= 7.28066 )
				if( basis <= 7.25749 )
					if( priceRange <= 0.143073 )
						if( sqzOnInt <= 0.5 )
							if( ma <= 7.1687 )
								if( ma <= 7.12308 )
									ret := 0.119835
								if( ma > 7.12308 )
									ret := -0.382470
							if( ma > 7.1687 )
								if( lowerBB <= 6.96764 )
									ret := -0.674157
								if( lowerBB > 6.96764 )
									ret := 0.242380
						if( sqzOnInt > 0.5 )
							if( rangema <= 0.02905 )
								if( basis <= 7.13014 )
									ret := 0.868421 // buy
								if( basis > 7.13014 )
									ret := 0.000000
							if( rangema > 0.02905 )
								if( lowerKC <= 7.07766 )
									ret := -0.525234
								if( lowerKC > 7.07766 )
									ret := -0.199595
					if( priceRange > 0.143073 )
						if( dev <= 0.219746 )
							if( rangema <= 0.090512 )
								if( lowerBB <= 6.98965 )
									ret := 0.333333
								if( lowerBB > 6.98965 )
									ret := 0.800000 // buy
							if( rangema > 0.090512 )
								ret := 1.000000 // buy
						if( dev > 0.219746 )
							if( upperKC <= 7.273 )
								if( val <= 0.019864 )
									ret := -1.000000 // sell
								if( val > 0.019864 )
									ret := 0.125000
							if( upperKC > 7.273 )
								if( upperKC <= 7.33557 )
									ret := 0.888889 // buy
								if( upperKC > 7.33557 )
									ret := -0.350000
				if( basis > 7.25749 )
					if( priceRange <= 0.028372 )
						if( upperBB <= 7.30097 )
							ret := -0.583333
						if( upperBB > 7.30097 )
							if( sqzOffInt <= 0.5 )
								ret := 0.000000
							if( sqzOffInt > 0.5 )
								if( lowerKC <= 7.21458 )
									ret := 0.000000
								if( lowerKC > 7.21458 )
									ret := 0.294118
					if( priceRange > 0.028372 )
						if( lowerKC <= 7.12481 )
							if( upperKC <= 7.42979 )
								ret := 0.727273 // buy
							if( upperKC > 7.42979 )
								ret := -0.583333
						if( lowerKC > 7.12481 )
							if( upperBB <= 7.33313 )
								if( lowerKC <= 7.17024 )
									ret := -0.125000
								if( lowerKC > 7.17024 )
									ret := -0.784314 // sell
							if( upperBB > 7.33313 )
								if( ma <= 7.27293 )
									ret := -0.574586
								if( ma > 7.27293 )
									ret := -0.015152
			if( basis > 7.28066 )
				if( lowerBB <= 14.8131 )
					if( lowerBB <= 14.6963 )
						if( lowerKC <= 14.5581 )
							if( upperBB <= 14.6161 )
								if( val <= 0.043522 )
									ret := -0.037657
								if( val > 0.043522 )
									ret := -0.857143 // sell
							if( upperBB > 14.6161 )
								if( avgHighLow <= 14.4624 )
									ret := 0.965517 // buy
								if( avgHighLow > 14.4624 )
									ret := 0.505376
						if( lowerKC > 14.5581 )
							if( upperKC <= 15.1448 )
								if( lowerKC <= 14.6 )
									ret := -0.882353 // sell
								if( lowerKC > 14.6 )
									ret := -1.000000 // sell
							if( upperKC > 15.1448 )
								ret := 0.692308
					if( lowerBB > 14.6963 )
						if( rangema <= 0.145053 )
							if( val <= -0.009104 )
								ret := 0.384615
							if( val > -0.009104 )
								if( val <= 0.01136 )
									ret := 0.894737 // buy
								if( val > 0.01136 )
									ret := 0.500000
						if( rangema > 0.145053 )
							if( avgHighLow <= 15.0842 )
								ret := -0.615385
							if( avgHighLow > 15.0842 )
								ret := 0.777778 // buy
				if( lowerBB > 14.8131 )
					if( upperKC <= 16.1042 )
						if( sqzOnInt <= 0.5 )
							if( dev <= 0.211109 )
								ret := 0.857143 // buy
							if( dev > 0.211109 )
								if( priceRange <= 0.112699 )
									ret := 0.040000
								if( priceRange > 0.112699 )
									ret := -0.804878 // sell
						if( sqzOnInt > 0.5 )
							if( lowerBB <= 14.8832 )
								if( val <= 0.005866 )
									ret := -0.888889 // sell
								if( val > 0.005866 )
									ret := 0.437500
							if( lowerBB > 14.8832 )
								if( dev <= 0.218255 )
									ret := -0.833333 // sell
								if( dev > 0.218255 )
									ret := -0.958333 // sell
					if( upperKC > 16.1042 )
						if( basis <= 15.8067 )
							if( lowerKC <= 15.3484 )
								if( avgHighLow <= 15.9267 )
									ret := 1.000000 // buy
								if( avgHighLow > 15.9267 )
									ret := 0.800000 // buy
							if( lowerKC > 15.3484 )
								ret := 0.416667
						if( basis > 15.8067 )
							ret := -0.647059
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Squeeze_Momentum_Indicator 
//@version=5
//indicator "Squeeze Momentum Indicator [LazyBear]", shorttitle="SQZMOM_LB", overlay=false)

lengthBB = input.int(20, title="BB Length")
mult = input.float(2.0, title="BB MultFactor")
lengthKC = input.int(20, title="KC Length")
multKC = input.float(1.5, title="KC MultFactor")

useTrueRange = input(true, title="Use TrueRange (KC)")

// Calculate BB
source = close
basis = ta.sma(source, lengthBB)
dev = multKC * ta.stdev(source, lengthBB)
upperBB = basis + dev
lowerBB = basis - dev

// Calculate KC
ma = ta.sma(source, lengthKC)
priceRange = useTrueRange ? ta.tr(true) : (high - low)
rangema = ta.sma(priceRange, lengthKC)
upperKC = ma + rangema * multKC
lowerKC = ma - rangema * multKC

sqzOn = (lowerBB > lowerKC) and (upperBB < upperKC)
sqzOff = (lowerBB < lowerKC) and (upperBB > upperKC)
noSqz = not sqzOn and not sqzOff
sqzOnInt = sqzOn ? 1: 0   //Bool to int
sqzOffInt = sqzOff ? 1: 0   //Bool to int
noSqzInt = noSqz ? 1: 0   //Bool to int

avgHighLow = (ta.highest(high, lengthKC) + ta.lowest(low, lengthKC)) / 2
val = ta.linreg(source - (avgHighLow + ta.sma(close, lengthKC)) / 2, lengthKC, 0)

bcolor = val > 0 ? (val > nz(val[1]) ? color.lime : color.green) : (val < nz(val[1]) ? color.red : color.maroon)
scolor = noSqz ? color.blue : sqzOn ? color.black : color.gray

plot(val, color=bcolor, style=plot.style_histogram, linewidth=4)
plot(0, color=scolor, style=plot.style_cross, linewidth=2)


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
float op_operation = decision_tree_0_UNIUSDT_15Min_a2a67ae2(lowerBB, noSqzInt, avgHighLow, rangema, sqzOffInt, upperKC, ma, basis, val, sqzOnInt, dev, priceRange, lowerKC, upperBB)

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


