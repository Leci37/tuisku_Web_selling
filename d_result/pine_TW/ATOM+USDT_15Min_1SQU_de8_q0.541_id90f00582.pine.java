//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: ATOMUSDT_15Min_1SQU_90f00582 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_15Min_1SQU_90f00582", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_15Min_90f00582(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rangema <= 0.048993 )
		if( lowerBB <= 4.93899 )
			if( avgHighLow <= 4.94657 )
				if( rangema <= 0.038802 )
					if( lowerBB <= 4.59426 )
						if( upperKC <= 4.60497 )
							if( lowerKC <= 3.96374 )
								if( ma <= 3.94238 )
									ret := 0.077889
								if( ma > 3.94238 )
									ret := 0.480000
							if( lowerKC > 3.96374 )
								if( val <= 0.002693 )
									ret := 0.029810
								if( val > 0.002693 )
									ret := -0.310897
						if( upperKC > 4.60497 )
							if( ma <= 4.68311 )
								if( upperKC <= 4.67506 )
									ret := 0.253846
								if( upperKC > 4.67506 )
									ret := 0.617647
							if( ma > 4.68311 )
								if( priceRange <= 0.018736 )
									ret := -0.750000 // sell
								if( priceRange > 0.018736 )
									ret := -1.000000 // sell
					if( lowerBB > 4.59426 )
						if( val <= 0.000719 )
							if( upperKC <= 4.80819 )
								if( priceRange <= 0.023055 )
									ret := -0.175573
								if( priceRange > 0.023055 )
									ret := -0.598039
							if( upperKC > 4.80819 )
								if( avgHighLow <= 4.79944 )
									ret := 0.587629
								if( avgHighLow > 4.79944 )
									ret := -0.065089
						if( val > 0.000719 )
							if( upperKC <= 4.97221 )
								if( upperBB <= 4.6548 )
									ret := -0.631579
								if( upperBB > 4.6548 )
									ret := 0.264901
							if( upperKC > 4.97221 )
								if( upperBB <= 4.98075 )
									ret := 0.333333
								if( upperBB > 4.98075 )
									ret := -0.642857
				if( rangema > 0.038802 )
					if( lowerBB <= 3.98232 )
						if( dev <= 0.058352 )
							ret := -1.000000 // sell
						if( dev > 0.058352 )
							ret := 0.000000
					if( lowerBB > 3.98232 )
						if( priceRange <= 0.02289 )
							if( rangema <= 0.039589 )
								ret := 0.500000
							if( rangema > 0.039589 )
								if( val <= 0.004961 )
									ret := -0.615385
								if( val > 0.004961 )
									ret := -0.272727
						if( priceRange > 0.02289 )
							if( upperBB <= 4.67782 )
								if( upperKC <= 4.6362 )
									ret := 0.390244
								if( upperKC > 4.6362 )
									ret := -1.000000 // sell
							if( upperBB > 4.67782 )
								if( lowerBB <= 4.78804 )
									ret := 0.731707 // buy
								if( lowerBB > 4.78804 )
									ret := 0.184211
			if( avgHighLow > 4.94657 )
				if( lowerKC <= 4.91638 )
					if( priceRange <= 0.078 )
						if( lowerBB <= 4.8696 )
							ret := 0.000000
						if( lowerBB > 4.8696 )
							if( avgHighLow <= 4.9542 )
								if( dev <= 0.046139 )
									ret := 0.760000 // buy
								if( dev > 0.046139 )
									ret := 0.333333
							if( avgHighLow > 4.9542 )
								if( dev <= 0.078561 )
									ret := 0.976190 // buy
								if( dev > 0.078561 )
									ret := 0.500000
					if( priceRange > 0.078 )
						ret := -0.500000
				if( lowerKC > 4.91638 )
					if( priceRange <= 0.0365 )
						if( dev <= 0.0638 )
							if( lowerKC <= 4.93704 )
								if( val <= -0.000182 )
									ret := 0.840000 // buy
								if( val > -0.000182 )
									ret := 0.076923
							if( lowerKC > 4.93704 )
								if( lowerBB <= 4.93118 )
									ret := 0.250000
								if( lowerBB > 4.93118 )
									ret := 0.851852 // buy
						if( dev > 0.0638 )
							if( rangema <= 0.0361 )
								if( lowerBB <= 4.8997 )
									ret := 0.250000
								if( lowerBB > 4.8997 )
									ret := 0.000000
							if( rangema > 0.0361 )
								if( val <= 0.003659 )
									ret := -0.857143 // sell
								if( val > 0.003659 )
									ret := 0.200000
					if( priceRange > 0.0365 )
						if( avgHighLow <= 4.98583 )
							if( ma <= 4.96571 )
								ret := 0.500000
							if( ma > 4.96571 )
								if( lowerKC <= 4.92856 )
									ret := -1.000000 // sell
								if( lowerKC > 4.92856 )
									ret := -0.666667
						if( avgHighLow > 4.98583 )
							if( dev <= 0.067819 )
								if( ma <= 4.99311 )
									ret := 0.500000
								if( ma > 4.99311 )
									ret := 1.000000 // buy
							if( dev > 0.067819 )
								if( avgHighLow <= 4.99825 )
									ret := -0.250000
								if( avgHighLow > 4.99825 )
									ret := 0.000000
		if( lowerBB > 4.93899 )
			if( dev <= 0.092811 )
				if( lowerBB <= 4.95405 )
					if( rangema <= 0.035403 )
						if( lowerBB <= 4.94012 )
							ret := 0.750000 // buy
						if( lowerBB > 4.94012 )
							if( upperBB <= 5.00832 )
								if( dev <= 0.02367 )
									ret := -0.333333
								if( dev > 0.02367 )
									ret := -0.933333 // sell
							if( upperBB > 5.00832 )
								if( rangema <= 0.0254 )
									ret := 0.000000
								if( rangema > 0.0254 )
									ret := -0.600000
					if( rangema > 0.035403 )
						if( priceRange <= 0.048595 )
							ret := -1.000000 // sell
						if( priceRange > 0.048595 )
							ret := -0.750000 // sell
				if( lowerBB > 4.95405 )
					if( priceRange <= 0.033302 )
						if( avgHighLow <= 9.30643 )
							if( lowerBB <= 9.21821 )
								if( dev <= 0.064443 )
									ret := -0.002966
								if( dev > 0.064443 )
									ret := -0.076416
							if( lowerBB > 9.21821 )
								if( upperBB <= 9.32991 )
									ret := 0.456000
								if( upperBB > 9.32991 )
									ret := 0.078788
						if( avgHighLow > 9.30643 )
							if( upperBB <= 9.67131 )
								if( avgHighLow <= 9.46525 )
									ret := -0.081365
								if( avgHighLow > 9.46525 )
									ret := -0.300781
							if( upperBB > 9.67131 )
								if( ma <= 9.7088 )
									ret := 0.167857
								if( ma > 9.7088 )
									ret := -0.041879
					if( priceRange > 0.033302 )
						if( basis <= 11.7437 )
							if( rangema <= 0.025353 )
								if( lowerKC <= 5.02141 )
									ret := 0.629630
								if( lowerKC > 5.02141 )
									ret := -0.116038
							if( rangema > 0.025353 )
								if( upperKC <= 9.2822 )
									ret := 0.083271
								if( upperKC > 9.2822 )
									ret := 0.020283
						if( basis > 11.7437 )
							if( avgHighLow <= 12.5041 )
								if( upperKC <= 12.4388 )
									ret := -0.179612
								if( upperKC > 12.4388 )
									ret := -0.723404 // sell
							if( avgHighLow > 12.5041 )
								if( dev <= 0.057259 )
									ret := 0.233696
								if( dev > 0.057259 )
									ret := -0.182648
			if( dev > 0.092811 )
				if( upperBB <= 5.86339 )
					if( val <= -0.008606 )
						if( rangema <= 0.042825 )
							if( avgHighLow <= 5.508 )
								ret := 0.000000
							if( avgHighLow > 5.508 )
								ret := -0.250000
						if( rangema > 0.042825 )
							ret := 0.833333 // buy
					if( val > -0.008606 )
						if( priceRange <= 0.028316 )
							if( dev <= 0.138511 )
								ret := 0.000000
							if( dev > 0.138511 )
								ret := -0.750000 // sell
						if( priceRange > 0.028316 )
							if( dev <= 0.104225 )
								ret := -1.000000 // sell
							if( dev > 0.104225 )
								if( dev <= 0.113054 )
									ret := 0.250000
								if( dev > 0.113054 )
									ret := -0.814815 // sell
				if( upperBB > 5.86339 )
					if( lowerBB <= 6.31435 )
						if( val <= -0.005968 )
							if( dev <= 0.103156 )
								if( upperBB <= 5.99327 )
									ret := -1.000000 // sell
								if( upperBB > 5.99327 )
									ret := -0.500000
							if( dev > 0.103156 )
								if( rangema <= 0.035275 )
									ret := 0.714286 // buy
								if( rangema > 0.035275 )
									ret := 0.000000
						if( val > -0.005968 )
							if( lowerKC <= 6.11097 )
								if( lowerKC <= 5.85634 )
									ret := 0.734694 // buy
								if( lowerKC > 5.85634 )
									ret := -0.058824
							if( lowerKC > 6.11097 )
								if( lowerBB <= 6.11127 )
									ret := 0.960000 // buy
								if( lowerBB > 6.11127 )
									ret := 0.609375
					if( lowerBB > 6.31435 )
						if( ma <= 8.30389 )
							if( avgHighLow <= 8.00575 )
								if( upperBB <= 7.08826 )
									ret := 0.200000
								if( upperBB > 7.08826 )
									ret := -0.145299
							if( avgHighLow > 8.00575 )
								if( avgHighLow <= 8.26293 )
									ret := -0.800000 // sell
								if( avgHighLow > 8.26293 )
									ret := 0.000000
						if( ma > 8.30389 )
							if( avgHighLow <= 8.45273 )
								if( priceRange <= 0.042393 )
									ret := 0.347826
								if( priceRange > 0.042393 )
									ret := 0.909091 // buy
							if( avgHighLow > 8.45273 )
								if( upperBB <= 9.3716 )
									ret := -0.116531
								if( upperBB > 9.3716 )
									ret := 0.158416
	if( rangema > 0.048993 )
		if( upperBB <= 12.0621 )
			if( avgHighLow <= 9.14514 )
				if( upperBB <= 9.13042 )
					if( ma <= 8.96905 )
						if( lowerBB <= 4.59479 )
							if( avgHighLow <= 4.45777 )
								if( avgHighLow <= 4.295 )
									ret := -0.340909
								if( avgHighLow > 4.295 )
									ret := 0.540984
							if( avgHighLow > 4.45777 )
								if( basis <= 4.84131 )
									ret := -0.683168
								if( basis > 4.84131 )
									ret := 0.166667
						if( lowerBB > 4.59479 )
							if( basis <= 5.86507 )
								if( sqzOffInt <= 0.5 )
									ret := 0.764368 // buy
								if( sqzOffInt > 0.5 )
									ret := 0.141463
							if( basis > 5.86507 )
								if( upperKC <= 6.16967 )
									ret := -0.381720
								if( upperKC > 6.16967 )
									ret := 0.131404
					if( ma > 8.96905 )
						if( dev <= 0.106674 )
							if( basis <= 9.05619 )
								if( ma <= 9.01166 )
									ret := 0.089474
								if( ma > 9.01166 )
									ret := -0.348624
							if( basis > 9.05619 )
								if( basis <= 9.06892 )
									ret := 1.000000 // buy
								if( basis > 9.06892 )
									ret := 0.800000 // buy
						if( dev > 0.106674 )
							if( ma <= 9.0168 )
								if( val <= 0.009044 )
									ret := -0.926471 // sell
								if( val > 0.009044 )
									ret := 0.000000
							if( ma > 9.0168 )
								ret := 0.000000
				if( upperBB > 9.13042 )
					if( val <= -0.006192 )
						if( avgHighLow <= 9.04155 )
							if( priceRange <= 0.059117 )
								if( avgHighLow <= 9.001 )
									ret := 0.388889
								if( avgHighLow > 9.001 )
									ret := -0.666667
							if( priceRange > 0.059117 )
								if( dev <= 0.219407 )
									ret := 0.166667
								if( dev > 0.219407 )
									ret := 0.739726 // buy
						if( avgHighLow > 9.04155 )
							if( rangema <= 0.053394 )
								if( dev <= 0.108422 )
									ret := 0.714286 // buy
								if( dev > 0.108422 )
									ret := -0.444444
							if( rangema > 0.053394 )
								if( lowerBB <= 8.94701 )
									ret := 0.517857
								if( lowerBB > 8.94701 )
									ret := 0.836735 // buy
					if( val > -0.006192 )
						if( dev <= 0.112863 )
							if( lowerKC <= 8.97793 )
								if( lowerKC <= 8.91869 )
									ret := -0.833333 // sell
								if( lowerKC > 8.91869 )
									ret := 0.704403 // buy
							if( lowerKC > 8.97793 )
								if( ma <= 9.11257 )
									ret := 0.032086
								if( ma > 9.11257 )
									ret := 0.404762
						if( dev > 0.112863 )
							if( ma <= 8.91713 )
								ret := 1.000000 // buy
							if( ma > 8.91713 )
								if( avgHighLow <= 8.967 )
									ret := -0.730769 // sell
								if( avgHighLow > 8.967 )
									ret := 0.125000
			if( avgHighLow > 9.14514 )
				if( upperKC <= 9.60495 )
					if( val <= 0.015763 )
						if( upperBB <= 9.26869 )
							if( upperBB <= 9.23591 )
								if( rangema <= 0.057469 )
									ret := 0.630435
								if( rangema > 0.057469 )
									ret := -0.250000
							if( upperBB > 9.23591 )
								if( val <= -0.000166 )
									ret := -0.266667
								if( val > -0.000166 )
									ret := -0.727273 // sell
						if( upperBB > 9.26869 )
							if( dev <= 0.28667 )
								if( lowerKC <= 9.11812 )
									ret := 0.195531
								if( lowerKC > 9.11812 )
									ret := -0.033836
							if( dev > 0.28667 )
								if( rangema <= 0.070698 )
									ret := -0.250000
								if( rangema > 0.070698 )
									ret := 0.926829 // buy
					if( val > 0.015763 )
						if( priceRange <= 0.139097 )
							if( lowerBB <= 8.99318 )
								ret := 0.285714
							if( lowerBB > 8.99318 )
								if( dev <= 0.161725 )
									ret := -0.400000
								if( dev > 0.161725 )
									ret := -0.846154 // sell
						if( priceRange > 0.139097 )
							if( upperBB <= 9.45158 )
								ret := -0.250000
							if( upperBB > 9.45158 )
								ret := 0.571429
				if( upperKC > 9.60495 )
					if( upperBB <= 9.71424 )
						if( lowerBB <= 9.55862 )
							if( upperBB <= 9.59989 )
								if( lowerBB <= 9.4603 )
									ret := 0.600000
								if( lowerBB > 9.4603 )
									ret := 1.000000 // buy
							if( upperBB > 9.59989 )
								if( lowerKC <= 9.30448 )
									ret := -0.407407
								if( lowerKC > 9.30448 )
									ret := 0.389091
						if( lowerBB > 9.55862 )
							if( lowerKC <= 9.54606 )
								if( rangema <= 0.063371 )
									ret := -1.000000 // sell
								if( rangema > 0.063371 )
									ret := -0.636364
							if( lowerKC > 9.54606 )
								if( priceRange <= 0.050226 )
									ret := 0.500000
								if( priceRange > 0.050226 )
									ret := 0.904762 // buy
					if( upperBB > 9.71424 )
						if( dev <= 0.092091 )
							if( upperKC <= 12.0072 )
								if( rangema <= 0.073524 )
									ret := -0.006704
								if( rangema > 0.073524 )
									ret := 0.164489
							if( upperKC > 12.0072 )
								if( lowerKC <= 11.855 )
									ret := 0.609524
								if( lowerKC > 11.855 )
									ret := 0.152778
						if( dev > 0.092091 )
							if( upperBB <= 9.90019 )
								if( lowerKC <= 9.63317 )
									ret := 0.005605
								if( lowerKC > 9.63317 )
									ret := -0.600000
							if( upperBB > 9.90019 )
								if( lowerKC <= 9.66721 )
									ret := 0.397671
								if( lowerKC > 9.66721 )
									ret := 0.113309
		if( upperBB > 12.0621 )
			if( lowerBB <= 18.0212 )
				if( ma <= 11.8987 )
					if( val <= -0.026502 )
						if( avgHighLow <= 11.5203 )
							if( lowerBB <= 11.0206 )
								if( val <= -0.066933 )
									ret := -1.000000 // sell
								if( val > -0.066933 )
									ret := 0.333333
							if( lowerBB > 11.0206 )
								ret := -1.000000 // sell
						if( avgHighLow > 11.5203 )
							if( lowerKC <= 11.3718 )
								ret := 1.000000 // buy
							if( lowerKC > 11.3718 )
								if( avgHighLow <= 11.6226 )
									ret := -0.800000 // sell
								if( avgHighLow > 11.6226 )
									ret := 0.450000
					if( val > -0.026502 )
						if( upperBB <= 12.0668 )
							if( lowerKC <= 11.6395 )
								if( upperKC <= 11.9759 )
									ret := -1.000000 // sell
								if( upperKC > 11.9759 )
									ret := 0.500000
							if( lowerKC > 11.6395 )
								if( lowerBB <= 11.5858 )
									ret := 1.000000 // buy
								if( lowerBB > 11.5858 )
									ret := 0.750000 // buy
						if( upperBB > 12.0668 )
							if( priceRange <= 0.1305 )
								if( avgHighLow <= 11.9733 )
									ret := -0.602484
								if( avgHighLow > 11.9733 )
									ret := 0.800000 // buy
							if( priceRange > 0.1305 )
								if( avgHighLow <= 11.8788 )
									ret := -0.418182
								if( avgHighLow > 11.8788 )
									ret := 0.470588
				if( ma > 11.8987 )
					if( val <= -0.012911 )
						if( lowerKC <= 11.7579 )
							if( priceRange <= 1.28417 )
								if( ma <= 12.1655 )
									ret := 0.805556 // buy
								if( ma > 12.1655 )
									ret := -0.142857
							if( priceRange > 1.28417 )
								ret := -1.000000 // sell
						if( lowerKC > 11.7579 )
							if( priceRange <= 0.083718 )
								if( avgHighLow <= 11.9861 )
									ret := -0.750000 // sell
								if( avgHighLow > 11.9861 )
									ret := 0.040491
							if( priceRange > 0.083718 )
								if( lowerBB <= 17.6536 )
									ret := 0.179563
								if( lowerBB > 17.6536 )
									ret := 0.693182
					if( val > -0.012911 )
						if( lowerKC <= 11.9264 )
							if( avgHighLow <= 12.0096 )
								if( rangema <= 0.12195 )
									ret := -0.174157
								if( rangema > 0.12195 )
									ret := 0.224242
							if( avgHighLow > 12.0096 )
								if( avgHighLow <= 12.0805 )
									ret := -0.539370
								if( avgHighLow > 12.0805 )
									ret := -0.129032
						if( lowerKC > 11.9264 )
							if( lowerKC <= 12.3007 )
								if( upperKC <= 12.3544 )
									ret := -0.022620
								if( upperKC > 12.3544 )
									ret := 0.210630
							if( lowerKC > 12.3007 )
								if( upperBB <= 12.5923 )
									ret := -0.322857
								if( upperBB > 12.5923 )
									ret := 0.008593
			if( lowerBB > 18.0212 )
				if( rangema <= 0.166492 )
					if( lowerKC <= 19.8391 )
						if( val <= -0.01634 )
							if( rangema <= 0.141343 )
								if( avgHighLow <= 18.378 )
									ret := 1.000000 // buy
								if( avgHighLow > 18.378 )
									ret := 0.200000
							if( rangema > 0.141343 )
								if( lowerBB <= 18.4034 )
									ret := -1.000000 // sell
								if( lowerBB > 18.4034 )
									ret := 0.000000
						if( val > -0.01634 )
							if( rangema <= 0.144625 )
								if( dev <= 0.125211 )
									ret := -0.830508 // sell
								if( dev > 0.125211 )
									ret := -0.278351
							if( rangema > 0.144625 )
								if( val <= 0.006128 )
									ret := -0.962264 // sell
								if( val > 0.006128 )
									ret := -0.666667
					if( lowerKC > 19.8391 )
						if( val <= 0.005729 )
							if( dev <= 0.127881 )
								if( basis <= 21.2457 )
									ret := -0.576923
								if( basis > 21.2457 )
									ret := -1.000000 // sell
							if( dev > 0.127881 )
								if( basis <= 20.9054 )
									ret := 0.481481
								if( basis > 20.9054 )
									ret := -0.285714
						if( val > 0.005729 )
							if( priceRange <= 0.139073 )
								if( dev <= 0.109783 )
									ret := 0.125000
								if( dev > 0.109783 )
									ret := -0.877551 // sell
							if( priceRange > 0.139073 )
								if( lowerKC <= 20.3848 )
									ret := 0.800000 // buy
								if( lowerKC > 20.3848 )
									ret := -0.333333
				if( rangema > 0.166492 )
					if( rangema <= 0.209278 )
						if( val <= -0.009756 )
							if( upperBB <= 18.8376 )
								ret := -0.750000 // sell
							if( upperBB > 18.8376 )
								if( priceRange <= 0.256576 )
									ret := 0.977778 // buy
								if( priceRange > 0.256576 )
									ret := 0.375000
						if( val > -0.009756 )
							if( lowerBB <= 20.5541 )
								if( lowerKC <= 18.2435 )
									ret := 0.666667
								if( lowerKC > 18.2435 )
									ret := -0.219512
							if( lowerBB > 20.5541 )
								if( ma <= 20.9967 )
									ret := 1.000000 // buy
								if( ma > 20.9967 )
									ret := -0.750000 // sell
					if( rangema > 0.209278 )
						if( priceRange <= 0.178225 )
							if( upperBB <= 20.3188 )
								ret := -1.000000 // sell
							if( upperBB > 20.3188 )
								if( basis <= 20.9988 )
									ret := 0.142857
								if( basis > 20.9988 )
									ret := -0.857143 // sell
						if( priceRange > 0.178225 )
							if( priceRange <= 0.275 )
								if( rangema <= 0.229 )
									ret := 0.600000
								if( rangema > 0.229 )
									ret := -0.428571
							if( priceRange > 0.275 )
								ret := -0.571429
	
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
float op_operation = decision_tree_0_ATOMUSDT_15Min_90f00582(val, sqzOnInt, lowerBB, lowerKC, upperKC, dev, rangema, sqzOffInt, upperBB, priceRange, noSqzInt, ma, basis, avgHighLow)

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


