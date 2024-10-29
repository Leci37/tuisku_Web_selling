//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: ATOMUSDT_5Min_1SQU_357b519d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_5Min_1SQU_357b519d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_5Min_357b519d(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rangema <= 0.026019 )
		if( basis <= 3.6949 )
			if( val <= 0.001948 )
				if( upperBB <= 3.68277 )
					if( upperBB <= 3.67707 )
						if( lowerBB <= 3.64293 )
							if( lowerBB <= 3.64264 )
								ret := 0.750000 // buy
							if( lowerBB > 3.64264 )
								ret := 0.250000
						if( lowerBB > 3.64293 )
							ret := 1.000000 // buy
					if( upperBB > 3.67707 )
						if( rangema <= 0.007475 )
							if( basis <= 3.67378 )
								ret := 0.000000
							if( basis > 3.67378 )
								ret := -0.250000
						if( rangema > 0.007475 )
							if( upperKC <= 3.6759 )
								ret := 0.000000
							if( upperKC > 3.6759 )
								if( upperBB <= 3.6816 )
									ret := 1.000000 // buy
								if( upperBB > 3.6816 )
									ret := 0.000000
				if( upperBB > 3.68277 )
					if( rangema <= 0.006428 )
						if( priceRange <= 0.006946 )
							ret := 1.000000 // buy
						if( priceRange > 0.006946 )
							ret := 0.571429
					if( rangema > 0.006428 )
						if( rangema <= 0.009891 )
							if( upperKC <= 3.68819 )
								if( rangema <= 0.007575 )
									ret := 1.000000 // buy
								if( rangema > 0.007575 )
									ret := 0.285714
							if( upperKC > 3.68819 )
								if( upperBB <= 3.69871 )
									ret := 0.093750
								if( upperBB > 3.69871 )
									ret := 0.515152
						if( rangema > 0.009891 )
							if( upperKC <= 3.70927 )
								ret := 1.000000 // buy
							if( upperKC > 3.70927 )
								ret := 0.714286 // buy
			if( val > 0.001948 )
				if( rangema <= 0.008695 )
					if( avgHighLow <= 3.67925 )
						ret := -0.400000
					if( avgHighLow > 3.67925 )
						if( lowerKC <= 3.67171 )
							ret := -0.750000 // sell
						if( lowerKC > 3.67171 )
							ret := -1.000000 // sell
				if( rangema > 0.008695 )
					if( upperKC <= 3.69026 )
						ret := 1.000000 // buy
					if( upperKC > 3.69026 )
						if( rangema <= 0.0103 )
							ret := -0.250000
						if( rangema > 0.0103 )
							if( upperBB <= 3.69591 )
								ret := 0.000000
							if( upperBB > 3.69591 )
								ret := 0.500000
		if( basis > 3.6949 )
			if( upperBB <= 12.3467 )
				if( avgHighLow <= 4.60451 )
					if( upperBB <= 4.61217 )
						if( priceRange <= 0.011043 )
							if( dev <= 0.012962 )
								if( lowerKC <= 4.1553 )
									ret := -0.018160
								if( lowerKC > 4.1553 )
									ret := 0.138920
							if( dev > 0.012962 )
								if( lowerBB <= 3.99055 )
									ret := 0.171875
								if( lowerBB > 3.99055 )
									ret := -0.060153
						if( priceRange > 0.011043 )
							if( avgHighLow <= 4.56762 )
								if( upperKC <= 4.57797 )
									ret := 0.095248
								if( upperKC > 4.57797 )
									ret := 0.500000
							if( avgHighLow > 4.56762 )
								if( lowerKC <= 4.55654 )
									ret := -0.552381
								if( lowerKC > 4.55654 )
									ret := 0.069498
					if( upperBB > 4.61217 )
						if( rangema <= 0.024428 )
							if( priceRange <= 0.037917 )
								if( upperBB <= 4.63119 )
									ret := 0.258760
								if( upperBB > 4.63119 )
									ret := 0.639344
							if( priceRange > 0.037917 )
								if( ma <= 4.59863 )
									ret := 0.333333
								if( ma > 4.59863 )
									ret := -1.000000 // sell
						if( rangema > 0.024428 )
							if( avgHighLow <= 4.58581 )
								if( lowerBB <= 4.50365 )
									ret := -0.833333 // sell
								if( lowerBB > 4.50365 )
									ret := -0.142857
							if( avgHighLow > 4.58581 )
								ret := -1.000000 // sell
				if( avgHighLow > 4.60451 )
					if( lowerBB <= 4.59328 )
						if( avgHighLow <= 4.64034 )
							if( lowerKC <= 4.59526 )
								if( lowerKC <= 4.58662 )
									ret := 0.032258
								if( lowerKC > 4.58662 )
									ret := -0.442396
							if( lowerKC > 4.59526 )
								if( upperKC <= 4.62272 )
									ret := 0.733333 // buy
								if( upperKC > 4.62272 )
									ret := -0.008333
						if( avgHighLow > 4.64034 )
							if( val <= 0.002583 )
								ret := -1.000000 // sell
							if( val > 0.002583 )
								if( avgHighLow <= 4.64713 )
									ret := -0.714286 // sell
								if( avgHighLow > 4.64713 )
									ret := -1.000000 // sell
					if( lowerBB > 4.59328 )
						if( val <= -0.003302 )
							if( dev <= 0.050125 )
								if( dev <= 0.02381 )
									ret := -0.028520
								if( dev > 0.02381 )
									ret := 0.150122
							if( dev > 0.050125 )
								if( upperBB <= 9.2216 )
									ret := 0.074251
								if( upperBB > 9.2216 )
									ret := -0.248780
						if( val > -0.003302 )
							if( upperBB <= 4.6277 )
								if( basis <= 4.60952 )
									ret := -0.028571
								if( basis > 4.60952 )
									ret := 0.504854
							if( upperBB > 4.6277 )
								if( rangema <= 0.017067 )
									ret := 0.004212
								if( rangema > 0.017067 )
									ret := 0.032907
			if( upperBB > 12.3467 )
				if( val <= -0.002316 )
					if( ma <= 13.4905 )
						if( dev <= 0.030264 )
							ret := -0.500000
						if( dev > 0.030264 )
							if( priceRange <= 0.0295 )
								ret := 0.000000
							if( priceRange > 0.0295 )
								ret := 0.250000
					if( ma > 13.4905 )
						if( lowerKC <= 13.4569 )
							ret := 1.000000 // buy
						if( lowerKC > 13.4569 )
							ret := 0.000000
				if( val > -0.002316 )
					if( avgHighLow <= 12.3115 )
						if( avgHighLow <= 12.2986 )
							if( priceRange <= 0.022678 )
								ret := -1.000000 // sell
							if( priceRange > 0.022678 )
								ret := -0.200000
						if( avgHighLow > 12.2986 )
							ret := -1.000000 // sell
					if( avgHighLow > 12.3115 )
						if( dev <= 0.044072 )
							if( lowerKC <= 12.3287 )
								if( lowerKC <= 12.2987 )
									ret := -0.555556
								if( lowerKC > 12.2987 )
									ret := 0.000000
							if( lowerKC > 12.3287 )
								if( upperBB <= 13.2302 )
									ret := -0.785714 // sell
								if( upperBB > 13.2302 )
									ret := 0.000000
						if( dev > 0.044072 )
							if( priceRange <= 0.019108 )
								if( val <= 0.004602 )
									ret := 0.000000
								if( val > 0.004602 )
									ret := -0.500000
							if( priceRange > 0.019108 )
								if( dev <= 0.05046 )
									ret := -0.090909
								if( dev > 0.05046 )
									ret := 0.375000
	if( rangema > 0.026019 )
		if( avgHighLow <= 9.18144 )
			if( lowerBB <= 4.23593 )
				if( val <= 0.003994 )
					if( val <= 0.001181 )
						if( basis <= 4.35723 )
							if( priceRange <= 0.018107 )
								if( upperBB <= 4.12349 )
									ret := 1.000000 // buy
								if( upperBB > 4.12349 )
									ret := 0.733333 // buy
							if( priceRange > 0.018107 )
								ret := 1.000000 // buy
						if( basis > 4.35723 )
							ret := 0.500000
					if( val > 0.001181 )
						if( dev <= 0.030347 )
							ret := -0.333333
						if( dev > 0.030347 )
							if( avgHighLow <= 4.2959 )
								if( lowerKC <= 4.15315 )
									ret := 0.647059
								if( lowerKC > 4.15315 )
									ret := 1.000000 // buy
							if( avgHighLow > 4.2959 )
								ret := 0.000000
				if( val > 0.003994 )
					if( avgHighLow <= 4.29976 )
						if( basis <= 4.29729 )
							if( priceRange <= 0.021019 )
								if( val <= 0.006002 )
									ret := -0.857143 // sell
								if( val > 0.006002 )
									ret := 0.250000
							if( priceRange > 0.021019 )
								if( rangema <= 0.028095 )
									ret := 0.000000
								if( rangema > 0.028095 )
									ret := 0.916667 // buy
						if( basis > 4.29729 )
							if( lowerKC <= 4.22042 )
								ret := -1.000000 // sell
							if( lowerKC > 4.22042 )
								if( dev <= 0.085273 )
									ret := 0.000000
								if( dev > 0.085273 )
									ret := -1.000000 // sell
					if( avgHighLow > 4.29976 )
						if( priceRange <= 0.048834 )
							ret := 0.500000
						if( priceRange > 0.048834 )
							ret := 1.000000 // buy
			if( lowerBB > 4.23593 )
				if( upperKC <= 9.07714 )
					if( lowerKC <= 8.96898 )
						if( avgHighLow <= 4.3975 )
							if( dev <= 0.069625 )
								if( upperBB <= 4.48675 )
									ret := -0.090909
								if( upperBB > 4.48675 )
									ret := -0.913043 // sell
							if( dev > 0.069625 )
								if( upperBB <= 4.50317 )
									ret := -0.965517 // sell
								if( upperBB > 4.50317 )
									ret := -0.125000
						if( avgHighLow > 4.3975 )
							if( val <= 0.000193 )
								if( sqzOnInt <= 0.5 )
									ret := 0.220644
								if( sqzOnInt > 0.5 )
									ret := 0.103907
							if( val > 0.000193 )
								if( rangema <= 0.0922 )
									ret := 0.059578
								if( rangema > 0.0922 )
									ret := 0.688073
					if( lowerKC > 8.96898 )
						if( upperKC <= 9.05765 )
							if( lowerBB <= 8.96649 )
								ret := 0.714286 // buy
							if( lowerBB > 8.96649 )
								ret := 0.000000
						if( upperKC > 9.05765 )
							if( upperBB <= 9.087 )
								if( val <= 0.004285 )
									ret := -0.845361 // sell
								if( val > 0.004285 )
									ret := 0.000000
							if( upperBB > 9.087 )
								if( lowerKC <= 8.97821 )
									ret := 0.800000 // buy
								if( lowerKC > 8.97821 )
									ret := -0.200000
				if( upperKC > 9.07714 )
					if( lowerKC <= 9.05906 )
						if( dev <= 0.056404 )
							if( lowerBB <= 9.00448 )
								if( upperBB <= 9.10094 )
									ret := 0.895833 // buy
								if( upperBB > 9.10094 )
									ret := 0.500000
							if( lowerBB > 9.00448 )
								if( ma <= 9.06631 )
									ret := -0.326087
								if( ma > 9.06631 )
									ret := 0.623188
						if( dev > 0.056404 )
							if( val <= -0.005423 )
								if( dev <= 0.132633 )
									ret := 0.557692
								if( dev > 0.132633 )
									ret := 0.958333 // buy
							if( val > -0.005423 )
								if( rangema <= 0.032537 )
									ret := -0.200000
								if( rangema > 0.032537 )
									ret := 0.321755
					if( lowerKC > 9.05906 )
						if( lowerKC <= 9.11349 )
							if( avgHighLow <= 9.11998 )
								if( dev <= 0.030842 )
									ret := 0.740000 // buy
								if( dev > 0.030842 )
									ret := 0.189591
							if( avgHighLow > 9.11998 )
								if( lowerBB <= 9.11533 )
									ret := -0.003883
								if( lowerBB > 9.11533 )
									ret := -0.607143
						if( lowerKC > 9.11349 )
							if( lowerKC <= 9.14917 )
								if( avgHighLow <= 9.16775 )
									ret := 0.261905
								if( avgHighLow > 9.16775 )
									ret := 0.616438
							if( lowerKC > 9.14917 )
								if( upperBB <= 9.28007 )
									ret := -0.250000
								if( upperBB > 9.28007 )
									ret := -0.750000 // sell
		if( avgHighLow > 9.18144 )
			if( dev <= 0.091151 )
				if( lowerKC <= 9.3486 )
					if( avgHighLow <= 9.28525 )
						if( rangema <= 0.039072 )
							if( lowerKC <= 9.27732 )
								if( lowerBB <= 9.24231 )
									ret := 0.065199
								if( lowerBB > 9.24231 )
									ret := 0.638889
							if( lowerKC > 9.27732 )
								if( lowerKC <= 9.27854 )
									ret := 0.750000 // buy
								if( lowerKC > 9.27854 )
									ret := 1.000000 // buy
						if( rangema > 0.039072 )
							if( avgHighLow <= 9.23939 )
								if( lowerKC <= 9.09725 )
									ret := 1.000000 // buy
								if( lowerKC > 9.09725 )
									ret := -0.593607
							if( avgHighLow > 9.23939 )
								if( lowerBB <= 9.17451 )
									ret := 0.800000 // buy
								if( lowerBB > 9.17451 )
									ret := -0.340909
					if( avgHighLow > 9.28525 )
						if( dev <= 0.031867 )
							if( val <= -0.000944 )
								if( avgHighLow <= 9.30737 )
									ret := 1.000000 // buy
								if( avgHighLow > 9.30737 )
									ret := 0.187500
							if( val > -0.000944 )
								if( rangema <= 0.034774 )
									ret := 0.900000 // buy
								if( rangema > 0.034774 )
									ret := 0.400000
						if( dev > 0.031867 )
							if( rangema <= 0.033288 )
								if( priceRange <= 0.020908 )
									ret := -0.480000
								if( priceRange > 0.020908 )
									ret := -0.059441
							if( rangema > 0.033288 )
								if( lowerKC <= 9.33517 )
									ret := -0.500879
								if( lowerKC > 9.33517 )
									ret := 0.365854
				if( lowerKC > 9.3486 )
					if( lowerBB <= 9.82233 )
						if( lowerKC <= 9.77675 )
							if( avgHighLow <= 9.68618 )
								if( val <= -0.002634 )
									ret := 0.381368
								if( val > -0.002634 )
									ret := 0.082601
							if( avgHighLow > 9.68618 )
								if( upperKC <= 9.79116 )
									ret := -0.350554
								if( upperKC > 9.79116 )
									ret := 0.061878
						if( lowerKC > 9.77675 )
							if( upperBB <= 9.89094 )
								if( val <= 0.002266 )
									ret := 0.741667 // buy
								if( val > 0.002266 )
									ret := 0.217949
							if( upperBB > 9.89094 )
								if( val <= 0.003022 )
									ret := 0.054381
								if( val > 0.003022 )
									ret := 0.576271
					if( lowerBB > 9.82233 )
						if( upperBB <= 9.99629 )
							if( upperKC <= 9.98141 )
								if( lowerBB <= 9.85578 )
									ret := -0.285294
								if( lowerBB > 9.85578 )
									ret := 0.154440
							if( upperKC > 9.98141 )
								if( ma <= 9.94918 )
									ret := -0.606695
								if( ma > 9.94918 )
									ret := 0.303030
						if( upperBB > 9.99629 )
							if( val <= -0.010438 )
								if( upperBB <= 12.2296 )
									ret := -0.453875
								if( upperBB > 12.2296 )
									ret := 0.000000
							if( val > -0.010438 )
								if( avgHighLow <= 13.8021 )
									ret := 0.035397
								if( avgHighLow > 13.8021 )
									ret := -0.381743
			if( dev > 0.091151 )
				if( val <= 0.006941 )
					if( priceRange <= 0.159941 )
						if( val <= -0.015203 )
							if( lowerKC <= 12.9906 )
								if( rangema <= 0.072625 )
									ret := -0.418103
								if( rangema > 0.072625 )
									ret := -0.052045
							if( lowerKC > 12.9906 )
								if( val <= -0.016274 )
									ret := 0.661290
								if( val > -0.016274 )
									ret := -0.400000
						if( val > -0.015203 )
							if( avgHighLow <= 13.6593 )
								if( sqzOnInt <= 0.5 )
									ret := 0.194873
								if( sqzOnInt > 0.5 )
									ret := 0.051387
							if( avgHighLow > 13.6593 )
								if( dev <= 0.136047 )
									ret := -0.379310
								if( dev > 0.136047 )
									ret := 0.463636
					if( priceRange > 0.159941 )
						if( avgHighLow <= 14.1644 )
							if( priceRange <= 0.213252 )
								if( val <= -0.000594 )
									ret := 0.610063
								if( val > -0.000594 )
									ret := 0.142857
							if( priceRange > 0.213252 )
								if( ma <= 10.2075 )
									ret := 0.235294
								if( ma > 10.2075 )
									ret := 0.834862 // buy
						if( avgHighLow > 14.1644 )
							ret := -1.000000 // sell
				if( val > 0.006941 )
					if( lowerKC <= 11.1078 )
						if( lowerKC <= 10.9888 )
							if( lowerBB <= 10.886 )
								if( rangema <= 0.035555 )
									ret := 0.533333
								if( rangema > 0.035555 )
									ret := 0.074642
							if( lowerBB > 10.886 )
								if( lowerBB <= 10.9662 )
									ret := -0.822222 // sell
								if( lowerBB > 10.9662 )
									ret := 0.000000
						if( lowerKC > 10.9888 )
							if( lowerKC <= 11.0596 )
								if( upperKC <= 11.1893 )
									ret := 0.357143
								if( upperKC > 11.1893 )
									ret := 0.985915 // buy
							if( lowerKC > 11.0596 )
								if( lowerKC <= 11.0669 )
									ret := -0.500000
								if( lowerKC > 11.0669 )
									ret := 0.680000
					if( lowerKC > 11.1078 )
						if( dev <= 0.094729 )
							if( lowerKC <= 12.3161 )
								if( upperBB <= 11.3836 )
									ret := -0.500000
								if( upperBB > 11.3836 )
									ret := 0.693548
							if( lowerKC > 12.3161 )
								if( priceRange <= 0.047 )
									ret := -1.000000 // sell
								if( priceRange > 0.047 )
									ret := 0.400000
						if( dev > 0.094729 )
							if( avgHighLow <= 11.3432 )
								if( rangema <= 0.059148 )
									ret := 0.054545
								if( rangema > 0.059148 )
									ret := -0.757282 // sell
							if( avgHighLow > 11.3432 )
								if( avgHighLow <= 13.4932 )
									ret := -0.051846
								if( avgHighLow > 13.4932 )
									ret := -0.495726
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_ATOMUSDT_5Min_357b519d(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)

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


