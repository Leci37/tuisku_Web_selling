//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: RIVN_5Min_1SQU_eafd0716 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RIVN_5Min_1SQU_eafd0716", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RIVN_5Min_eafd0716(avgHighLow, priceRange, upperBB, upperKC, sqzOffInt, dev, ma, sqzOnInt, lowerBB, rangema, basis, lowerKC, val, noSqzInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( val <= -0.007244 )
		if( val <= -0.02379 )
			if( lowerKC <= 13.9463 )
				if( lowerKC <= 12.7448 )
					if( upperBB <= 11.717 )
						if( upperBB <= 11.3219 )
							if( lowerBB <= 10.9274 )
								if( avgHighLow <= 10.5349 )
									ret := -0.535714
								if( avgHighLow > 10.5349 )
									ret := 0.605263
							if( lowerBB > 10.9274 )
								if( val <= -0.029189 )
									ret := -0.750000 // sell
								if( val > -0.029189 )
									ret := -1.000000 // sell
						if( upperBB > 11.3219 )
							if( upperKC <= 11.0996 )
								if( upperBB <= 11.4753 )
									ret := -1.000000 // sell
								if( upperBB > 11.4753 )
									ret := -0.750000 // sell
							if( upperKC > 11.0996 )
								if( upperKC <= 11.168 )
									ret := 0.500000
								if( upperKC > 11.168 )
									ret := -0.609756
					if( upperBB > 11.717 )
						if( dev <= 0.447227 )
							if( upperBB <= 11.9189 )
								ret := 1.000000 // buy
							if( upperBB > 11.9189 )
								if( val <= -0.024036 )
									ret := -0.058824
								if( val > -0.024036 )
									ret := 0.800000 // buy
						if( dev > 0.447227 )
							ret := 1.000000 // buy
				if( lowerKC > 12.7448 )
					if( lowerBB <= 12.9614 )
						if( lowerKC <= 12.9162 )
							ret := -1.000000 // sell
						if( lowerKC > 12.9162 )
							if( ma <= 13.1446 )
								ret := 0.000000
							if( ma > 13.1446 )
								if( priceRange <= 0.181365 )
									ret := -0.576923
								if( priceRange > 0.181365 )
									ret := -1.000000 // sell
					if( lowerBB > 12.9614 )
						if( upperBB <= 14.183 )
							if( basis <= 13.4727 )
								if( avgHighLow <= 13.4971 )
									ret := 0.250000
								if( avgHighLow > 13.4971 )
									ret := 1.000000 // buy
							if( basis > 13.4727 )
								if( priceRange <= 0.08938 )
									ret := -0.733333 // sell
								if( priceRange > 0.08938 )
									ret := 0.000000
						if( upperBB > 14.183 )
							if( lowerKC <= 13.7783 )
								if( ma <= 13.8775 )
									ret := 1.000000 // buy
								if( ma > 13.8775 )
									ret := 0.750000 // buy
							if( lowerKC > 13.7783 )
								ret := -0.166667
			if( lowerKC > 13.9463 )
				if( dev <= 1.18857 )
					if( rangema <= 0.351169 )
						if( rangema <= 0.279786 )
							if( lowerBB <= 24.7131 )
								if( val <= -0.05893 )
									ret := 0.803279 // buy
								if( val > -0.05893 )
									ret := 0.166937
							if( lowerBB > 24.7131 )
								if( basis <= 26.1666 )
									ret := -0.219626
								if( basis > 26.1666 )
									ret := 0.358491
						if( rangema > 0.279786 )
							if( upperKC <= 18.9145 )
								if( lowerKC <= 17.3883 )
									ret := 0.684211
								if( lowerKC > 17.3883 )
									ret := -0.850000 // sell
							if( upperKC > 18.9145 )
								if( lowerBB <= 27.2442 )
									ret := 0.713333 // buy
								if( lowerBB > 27.2442 )
									ret := -0.222222
					if( rangema > 0.351169 )
						if( avgHighLow <= 17.7799 )
							if( lowerBB <= 16.0236 )
								ret := 1.000000 // buy
							if( lowerBB > 16.0236 )
								if( dev <= 1.12823 )
									ret := -1.000000 // sell
								if( dev > 1.12823 )
									ret := -0.500000
						if( avgHighLow > 17.7799 )
							if( rangema <= 0.414413 )
								if( basis <= 23.0082 )
									ret := -0.733333 // sell
								if( basis > 23.0082 )
									ret := -0.294118
							if( rangema > 0.414413 )
								if( avgHighLow <= 24.085 )
									ret := 0.736842 // buy
								if( avgHighLow > 24.085 )
									ret := -0.187500
				if( dev > 1.18857 )
					if( val <= -0.037716 )
						if( dev <= 1.24854 )
							if( val <= -0.057457 )
								if( priceRange <= 0.255 )
									ret := 0.250000
								if( priceRange > 0.255 )
									ret := 0.750000 // buy
							if( val > -0.057457 )
								ret := 1.000000 // buy
						if( dev > 1.24854 )
							ret := 1.000000 // buy
					if( val > -0.037716 )
						ret := 0.000000
		if( val > -0.02379 )
			if( upperKC <= 11.0369 )
				if( priceRange <= 0.094869 )
					if( lowerBB <= 8.84477 )
						if( avgHighLow <= 8.76831 )
							if( lowerKC <= 8.45065 )
								ret := 1.000000 // buy
							if( lowerKC > 8.45065 )
								if( upperBB <= 8.83719 )
									ret := 0.562500
								if( upperBB > 8.83719 )
									ret := 1.000000 // buy
						if( avgHighLow > 8.76831 )
							if( dev <= 0.152284 )
								if( dev <= 0.106886 )
									ret := -0.583333
								if( dev > 0.106886 )
									ret := 0.222222
							if( dev > 0.152284 )
								if( upperBB <= 9.07324 )
									ret := -0.750000 // sell
								if( upperBB > 9.07324 )
									ret := -1.000000 // sell
					if( lowerBB > 8.84477 )
						if( upperBB <= 9.49785 )
							if( rangema <= 0.059423 )
								if( dev <= 0.063069 )
									ret := 0.735294 // buy
								if( dev > 0.063069 )
									ret := 0.227273
							if( rangema > 0.059423 )
								ret := 1.000000 // buy
						if( upperBB > 9.49785 )
							if( upperKC <= 9.84521 )
								if( avgHighLow <= 9.6929 )
									ret := -0.428571
								if( avgHighLow > 9.6929 )
									ret := -1.000000 // sell
							if( upperKC > 9.84521 )
								if( lowerBB <= 9.98845 )
									ret := 0.725806 // buy
								if( lowerBB > 9.98845 )
									ret := 0.181004
				if( priceRange > 0.094869 )
					if( val <= -0.016805 )
						if( avgHighLow <= 10.54 )
							if( priceRange <= 0.111704 )
								if( upperKC <= 10.3587 )
									ret := -0.500000
								if( upperKC > 10.3587 )
									ret := -1.000000 // sell
							if( priceRange > 0.111704 )
								if( rangema <= 0.081572 )
									ret := -0.500000
								if( rangema > 0.081572 )
									ret := 0.857143 // buy
						if( avgHighLow > 10.54 )
							if( lowerBB <= 10.6293 )
								ret := 1.000000 // buy
							if( lowerBB > 10.6293 )
								ret := 0.750000 // buy
					if( val > -0.016805 )
						if( upperBB <= 10.1028 )
							if( upperKC <= 9.09457 )
								ret := -1.000000 // sell
							if( upperKC > 9.09457 )
								if( lowerKC <= 9.08338 )
									ret := 0.400000
								if( lowerKC > 9.08338 )
									ret := 0.833333 // buy
						if( upperBB > 10.1028 )
							if( upperKC <= 10.9387 )
								if( ma <= 10.1631 )
									ret := -0.896552 // sell
								if( ma > 10.1631 )
									ret := -0.500000
							if( upperKC > 10.9387 )
								if( rangema <= 0.095183 )
									ret := 0.000000
								if( rangema > 0.095183 )
									ret := 0.750000 // buy
			if( upperKC > 11.0369 )
				if( lowerKC <= 10.9073 )
					if( rangema <= 0.058025 )
						if( avgHighLow <= 11.0151 )
							if( upperBB <= 11.0917 )
								ret := 1.000000 // buy
							if( upperBB > 11.0917 )
								ret := 0.333333
						if( avgHighLow > 11.0151 )
							ret := -1.000000 // sell
					if( rangema > 0.058025 )
						if( val <= -0.016058 )
							if( lowerKC <= 10.7298 )
								ret := 0.800000 // buy
							if( lowerKC > 10.7298 )
								if( avgHighLow <= 10.9887 )
									ret := -0.684211
								if( avgHighLow > 10.9887 )
									ret := 0.250000
						if( val > -0.016058 )
							if( upperBB <= 11.0898 )
								if( priceRange <= 0.035305 )
									ret := -0.250000
								if( priceRange > 0.035305 )
									ret := -0.972222 // sell
							if( upperBB > 11.0898 )
								if( dev <= 0.188885 )
									ret := -0.260870
								if( dev > 0.188885 )
									ret := -1.000000 // sell
				if( lowerKC > 10.9073 )
					if( upperKC <= 20.563 )
						if( sqzOnInt <= 0.5 )
							if( rangema <= 0.163319 )
								if( rangema <= 0.149424 )
									ret := 0.047246
								if( rangema > 0.149424 )
									ret := 0.325153
							if( rangema > 0.163319 )
								if( lowerKC <= 13.4379 )
									ret := -0.830986 // sell
								if( lowerKC > 13.4379 )
									ret := 0.012903
						if( sqzOnInt > 0.5 )
							if( upperBB <= 20.0435 )
								if( rangema <= 0.073461 )
									ret := 0.017946
								if( rangema > 0.073461 )
									ret := -0.174018
							if( upperBB > 20.0435 )
								if( upperKC <= 20.224 )
									ret := 0.735294 // buy
								if( upperKC > 20.224 )
									ret := 0.230769
					if( upperKC > 20.563 )
						if( lowerKC <= 20.4573 )
							if( basis <= 20.2398 )
								ret := 0.500000
							if( basis > 20.2398 )
								if( upperBB <= 20.6606 )
									ret := -0.400000
								if( upperBB > 20.6606 )
									ret := -0.842105 // sell
						if( lowerKC > 20.4573 )
							if( upperBB <= 21.3928 )
								if( upperBB <= 21.2436 )
									ret := -0.055249
								if( upperBB > 21.2436 )
									ret := 0.404762
							if( upperBB > 21.3928 )
								if( lowerKC <= 21.37 )
									ret := -0.743590 // sell
								if( lowerKC > 21.37 )
									ret := -0.073918
	if( val > -0.007244 )
		if( upperBB <= 26.87 )
			if( dev <= 0.144552 )
				if( ma <= 26.1743 )
					if( upperBB <= 10.2895 )
						if( upperBB <= 9.85648 )
							if( avgHighLow <= 8.75986 )
								if( upperBB <= 8.77218 )
									ret := 0.076633
								if( upperBB > 8.77218 )
									ret := 0.489177
							if( avgHighLow > 8.75986 )
								if( avgHighLow <= 8.8102 )
									ret := -0.287879
								if( avgHighLow > 8.8102 )
									ret := -0.010229
						if( upperBB > 9.85648 )
							if( priceRange <= 0.040503 )
								if( val <= 0.001289 )
									ret := 0.212698
								if( val > 0.001289 )
									ret := -0.011407
							if( priceRange > 0.040503 )
								if( lowerKC <= 10.0982 )
									ret := 0.652174
								if( lowerKC > 10.0982 )
									ret := -0.011364
					if( upperBB > 10.2895 )
						if( ma <= 10.3199 )
							if( lowerKC <= 10.1028 )
								if( upperBB <= 10.3092 )
									ret := -0.860465 // sell
								if( upperBB > 10.3092 )
									ret := -0.450000
							if( lowerKC > 10.1028 )
								if( val <= 0.015323 )
									ret := -0.202294
								if( val > 0.015323 )
									ret := 0.705882 // buy
						if( ma > 10.3199 )
							if( ma <= 10.3568 )
								if( avgHighLow <= 10.3493 )
									ret := 0.466667
								if( avgHighLow > 10.3493 )
									ret := 0.083333
							if( ma > 10.3568 )
								if( rangema <= 0.209546 )
									ret := 0.042861
								if( rangema > 0.209546 )
									ret := -0.840000 // sell
				if( ma > 26.1743 )
					if( lowerKC <= 26.617 )
						if( basis <= 26.6564 )
							if( basis <= 26.2842 )
								if( val <= 0.008014 )
									ret := 0.945946 // buy
								if( val > 0.008014 )
									ret := 0.142857
							if( basis > 26.2842 )
								if( avgHighLow <= 26.4603 )
									ret := -0.272727
								if( avgHighLow > 26.4603 )
									ret := 0.370370
						if( basis > 26.6564 )
							if( upperKC <= 26.7546 )
								if( val <= 1.5e-05 )
									ret := 0.250000
								if( val > 1.5e-05 )
									ret := 0.833333 // buy
							if( upperKC > 26.7546 )
								if( basis <= 26.734 )
									ret := 0.902439 // buy
								if( basis > 26.734 )
									ret := 0.500000
					if( lowerKC > 26.617 )
						if( sqzOnInt <= 0.5 )
							ret := 0.250000
						if( sqzOnInt > 0.5 )
							if( val <= 0.005109 )
								ret := -0.428571
							if( val > 0.005109 )
								ret := -1.000000 // sell
			if( dev > 0.144552 )
				if( lowerKC <= 13.5425 )
					if( avgHighLow <= 12.7128 )
						if( dev <= 0.160641 )
							if( rangema <= 0.073447 )
								if( val <= 0.004866 )
									ret := -0.032609
								if( val > 0.004866 )
									ret := 0.403361
							if( rangema > 0.073447 )
								if( val <= -0.003408 )
									ret := -0.217391
								if( val > -0.003408 )
									ret := 0.628019
						if( dev > 0.160641 )
							if( ma <= 11.4198 )
								if( upperKC <= 11.169 )
									ret := -0.003836
								if( upperKC > 11.169 )
									ret := 0.412791
							if( ma > 11.4198 )
								if( ma <= 11.5727 )
									ret := -0.729412 // sell
								if( ma > 11.5727 )
									ret := -0.003195
					if( avgHighLow > 12.7128 )
						if( rangema <= 0.159198 )
							if( val <= 0.025463 )
								if( dev <= 0.332781 )
									ret := 0.410217
								if( dev > 0.332781 )
									ret := -0.218182
							if( val > 0.025463 )
								if( rangema <= 0.131075 )
									ret := 0.045455
								if( rangema > 0.131075 )
									ret := -0.714286 // sell
						if( rangema > 0.159198 )
							if( upperKC <= 14.2497 )
								if( upperBB <= 13.0146 )
									ret := -0.500000
								if( upperBB > 13.0146 )
									ret := 0.843750 // buy
							if( upperKC > 14.2497 )
								ret := -0.333333
				if( lowerKC > 13.5425 )
					if( basis <= 13.825 )
						if( avgHighLow <= 13.6825 )
							if( basis <= 13.6622 )
								ret := -1.000000 // sell
							if( basis > 13.6622 )
								if( rangema <= 0.085157 )
									ret := 0.888889 // buy
								if( rangema > 0.085157 )
									ret := 0.000000
						if( avgHighLow > 13.6825 )
							if( lowerKC <= 13.6194 )
								if( lowerKC <= 13.5492 )
									ret := 0.000000
								if( lowerKC > 13.5492 )
									ret := -0.927536 // sell
							if( lowerKC > 13.6194 )
								if( basis <= 13.7684 )
									ret := 0.466667
								if( basis > 13.7684 )
									ret := -0.727273 // sell
					if( basis > 13.825 )
						if( rangema <= 0.425113 )
							if( lowerKC <= 13.9593 )
								if( rangema <= 0.17271 )
									ret := 0.430986
								if( rangema > 0.17271 )
									ret := -0.173913
							if( lowerKC > 13.9593 )
								if( basis <= 14.2592 )
									ret := -0.433824
								if( basis > 14.2592 )
									ret := 0.080956
						if( rangema > 0.425113 )
							if( ma <= 24.9511 )
								if( val <= 0.000168 )
									ret := 0.200000
								if( val > 0.000168 )
									ret := 0.920635 // buy
							if( ma > 24.9511 )
								ret := 0.000000
		if( upperBB > 26.87 )
			if( rangema <= 0.09647 )
				if( rangema <= 0.047475 )
					if( val <= 0.000114 )
						if( sqzOffInt <= 0.5 )
							if( rangema <= 0.035268 )
								ret := 0.000000
							if( rangema > 0.035268 )
								ret := 0.250000
						if( sqzOffInt > 0.5 )
							if( dev <= 0.099153 )
								ret := 0.750000 // buy
							if( dev > 0.099153 )
								ret := 0.000000
					if( val > 0.000114 )
						if( lowerBB <= 26.8888 )
							ret := 1.000000 // buy
						if( lowerBB > 26.8888 )
							if( ma <= 27.4275 )
								ret := 0.166667
							if( ma > 27.4275 )
								if( val <= 0.002034 )
									ret := 1.000000 // buy
								if( val > 0.002034 )
									ret := 0.750000 // buy
				if( rangema > 0.047475 )
					if( sqzOffInt <= 0.5 )
						if( avgHighLow <= 27.1457 )
							if( upperBB <= 26.9096 )
								ret := -1.000000 // sell
							if( upperBB > 26.9096 )
								if( lowerKC <= 27.1885 )
									ret := 0.150000
								if( lowerKC > 27.1885 )
									ret := -0.714286 // sell
						if( avgHighLow > 27.1457 )
							if( val <= -0.005629 )
								ret := 0.000000
							if( val > -0.005629 )
								if( upperBB <= 27.255 )
									ret := 0.200000
								if( upperBB > 27.255 )
									ret := 0.803922 // buy
					if( sqzOffInt > 0.5 )
						if( basis <= 27.0709 )
							if( val <= 0.006087 )
								if( rangema <= 0.05962 )
									ret := 0.555556
								if( rangema > 0.05962 )
									ret := 0.000000
							if( val > 0.006087 )
								if( priceRange <= 0.106994 )
									ret := 0.866667 // buy
								if( priceRange > 0.106994 )
									ret := 0.250000
						if( basis > 27.0709 )
							if( lowerKC <= 27.1926 )
								if( upperKC <= 27.3857 )
									ret := -0.526316
								if( upperKC > 27.3857 )
									ret := -1.000000 // sell
							if( lowerKC > 27.1926 )
								if( lowerBB <= 27.4968 )
									ret := 0.131579
								if( lowerBB > 27.4968 )
									ret := -0.619048
			if( rangema > 0.09647 )
				if( upperKC <= 27.8859 )
					if( avgHighLow <= 27.5068 )
						if( ma <= 26.5579 )
							ret := -1.000000 // sell
						if( ma > 26.5579 )
							if( lowerKC <= 26.4106 )
								ret := 0.714286 // buy
							if( lowerKC > 26.4106 )
								if( upperBB <= 27.3599 )
									ret := -0.301075
								if( upperBB > 27.3599 )
									ret := -0.671429
					if( avgHighLow > 27.5068 )
						ret := 1.000000 // buy
				if( upperKC > 27.8859 )
					if( val <= 0.009037 )
						ret := -1.000000 // sell
					if( val > 0.009037 )
						if( rangema <= 0.259624 )
							ret := -0.250000
						if( rangema > 0.259624 )
							if( lowerKC <= 27.0518 )
								ret := -1.000000 // sell
							if( lowerKC > 27.0518 )
								ret := -0.750000 // sell
	
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
float op_operation = decision_tree_0_RIVN_5Min_eafd0716(avgHighLow, priceRange, upperBB, upperKC, sqzOffInt, dev, ma, sqzOnInt, lowerBB, rangema, basis, lowerKC, val, noSqzInt)

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


