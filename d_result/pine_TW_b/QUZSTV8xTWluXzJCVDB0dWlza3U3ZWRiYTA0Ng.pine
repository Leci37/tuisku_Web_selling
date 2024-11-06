//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: AFRM_1Min_2BT0_7edba046 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AFRM_1Min_2BT0_7edba046", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AFRM_1Min_7edba046(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bullPower <= -0.012643 )
		if( ema12 <= -0.015038 )
			if( bullPower <= -0.186638 )
				if( bearPower <= -0.556339 )
					if( ema1 <= 38.2134 )
						if( bbp <= -1.82791 )
							if( ema1 <= 24.801 )
								ret := 1.000000 // buy
							if( ema1 > 24.801 )
								ret := 0.500000
						if( bbp > -1.82791 )
							if( bbm <= 0.107975 )
								if( bbm <= 0.035 )
									ret := 0.000000
								if( bbm > 0.035 )
									ret := 1.000000 // buy
							if( bbm > 0.107975 )
								if( bbp <= -1.04019 )
									ret := -0.762712 // sell
								if( bbp > -1.04019 )
									ret := -0.153846
					if( ema1 > 38.2134 )
						if( ema13 <= -0.302904 )
							if( tema <= 44.8925 )
								if( bearPower <= -0.588256 )
									ret := 0.846154 // buy
								if( bearPower > -0.588256 )
									ret := 0.000000
							if( tema > 44.8925 )
								if( ema1 <= 46.7181 )
									ret := -0.700000 // sell
								if( ema1 > 46.7181 )
									ret := 0.750000 // buy
						if( ema13 > -0.302904 )
							if( ema1 <= 43.578 )
								ret := -1.000000 // sell
							if( ema1 > 43.578 )
								ret := -0.500000
				if( bearPower > -0.556339 )
					if( bbm <= 0.053786 )
						if( ema12 <= -0.120913 )
							if( tema <= 23.134 )
								ret := -0.285714
							if( tema > 23.134 )
								if( ema12 <= -0.160486 )
									ret := 0.800000 // buy
								if( ema12 > -0.160486 )
									ret := 0.583333
						if( ema12 > -0.120913 )
							if( ema13 <= -0.113885 )
								if( bullPower <= -0.327013 )
									ret := -0.666667
								if( bullPower > -0.327013 )
									ret := 0.226891
							if( ema13 > -0.113885 )
								if( ema12 <= -0.069055 )
									ret := 0.526316
								if( ema12 > -0.069055 )
									ret := 0.833333 // buy
					if( bbm > 0.053786 )
						if( bbp <= -0.543319 )
							if( ema1 <= 33.4909 )
								if( ema12 <= -0.187489 )
									ret := 0.700680 // buy
								if( ema12 > -0.187489 )
									ret := 0.337209
							if( ema1 > 33.4909 )
								if( ema3 <= 38.0533 )
									ret := -0.416667
								if( ema3 > 38.0533 )
									ret := 0.334365
						if( bbp > -0.543319 )
							if( ema12 <= -0.13162 )
								if( ema1 <= 40.2015 )
									ret := -0.302326
								if( ema1 > 40.2015 )
									ret := 0.212121
							if( ema12 > -0.13162 )
								if( ema1 <= 39.0753 )
									ret := 0.527273
								if( ema1 > 39.0753 )
									ret := -0.173913
			if( bullPower > -0.186638 )
				if( bbm <= 0.00862 )
					if( bearPower <= -0.044727 )
						if( ema12 <= -0.02121 )
							if( bbp <= -0.256507 )
								if( ema2 <= 38.1927 )
									ret := 0.604396
								if( ema2 > 38.1927 )
									ret := 0.125000
							if( bbp > -0.256507 )
								if( ema13 <= -0.018923 )
									ret := 0.238141
								if( ema13 > -0.018923 )
									ret := -0.333333
						if( ema12 > -0.02121 )
							if( ema13 <= -0.000669 )
								if( bbm <= 0.006178 )
									ret := 0.565934
								if( bbm > 0.006178 )
									ret := 1.000000 // buy
							if( ema13 > -0.000669 )
								if( ema13 <= 0.011342 )
									ret := -0.400000
								if( ema13 > 0.011342 )
									ret := 0.600000
					if( bearPower > -0.044727 )
						if( ema2 <= 24.5169 )
							if( bearPower <= -0.030892 )
								ret := 0.500000
							if( bearPower > -0.030892 )
								ret := 1.000000 // buy
						if( ema2 > 24.5169 )
							if( ema2 <= 25.6657 )
								if( ema13 <= -0.034707 )
									ret := -1.000000 // sell
								if( ema13 > -0.034707 )
									ret := -0.500000
							if( ema2 > 25.6657 )
								if( ema12 <= -0.086391 )
									ret := -0.714286 // sell
								if( ema12 > -0.086391 )
									ret := 0.130856
				if( bbm > 0.00862 )
					if( ema1 <= 24.1961 )
						if( tema <= 23.3826 )
							if( bullPower <= -0.125733 )
								if( bbm <= 0.022163 )
									ret := 0.500000
								if( bbm > 0.022163 )
									ret := 1.000000 // buy
							if( bullPower > -0.125733 )
								if( ema1 <= 22.1137 )
									ret := 0.625000
								if( ema1 > 22.1137 )
									ret := -0.888889 // sell
						if( tema > 23.3826 )
							if( ema12 <= -0.045939 )
								if( ema2 <= 24.1834 )
									ret := 0.982143 // buy
								if( ema2 > 24.1834 )
									ret := 0.833333 // buy
							if( ema12 > -0.045939 )
								if( ema1 <= 24.0683 )
									ret := 0.666667
								if( ema1 > 24.0683 )
									ret := -1.000000 // sell
					if( ema1 > 24.1961 )
						if( ema3 <= 45.6472 )
							if( ema2 <= 24.3298 )
								if( bearPower <= -0.117566 )
									ret := -0.862069 // sell
								if( bearPower > -0.117566 )
									ret := -0.222222
							if( ema2 > 24.3298 )
								if( ema1 <= 24.3686 )
									ret := 0.721311 // buy
								if( ema1 > 24.3686 )
									ret := 0.063169
						if( ema3 > 45.6472 )
							if( tema <= 48.5259 )
								if( ema12 <= -0.163365 )
									ret := 0.592593
								if( ema12 > -0.163365 )
									ret := -0.489879
							if( tema > 48.5259 )
								if( ema12 <= -0.050648 )
									ret := 0.653846
								if( ema12 > -0.050648 )
									ret := -0.538462
		if( ema12 > -0.015038 )
			if( bullPower <= -0.037427 )
				if( ema2 <= 35.804 )
					if( ema3 <= 30.453 )
						if( tema <= 29.6572 )
							if( ema1 <= 29.5983 )
								if( ema1 <= 26.1168 )
									ret := 0.296703
								if( ema1 > 26.1168 )
									ret := 0.602871
							if( ema1 > 29.5983 )
								if( tema <= 29.6046 )
									ret := -0.600000
								if( tema > 29.6046 )
									ret := -0.916667 // sell
						if( tema > 29.6572 )
							if( bbp <= -0.289084 )
								ret := -0.750000 // sell
							if( bbp > -0.289084 )
								if( ema2 <= 29.7829 )
									ret := 1.000000 // buy
								if( ema2 > 29.7829 )
									ret := 0.718750 // buy
					if( ema3 > 30.453 )
						if( ema3 <= 30.5255 )
							if( ema2 <= 30.5075 )
								ret := -0.750000 // sell
							if( ema2 > 30.5075 )
								ret := -1.000000 // sell
						if( ema3 > 30.5255 )
							if( bbm <= 0.044272 )
								if( bullPower <= -0.078551 )
									ret := 0.682927
								if( bullPower > -0.078551 )
									ret := 0.372294
							if( bbm > 0.044272 )
								if( ema1 <= 32.0462 )
									ret := 0.565217
								if( ema1 > 32.0462 )
									ret := -0.400000
				if( ema2 > 35.804 )
					if( ema12 <= 0.013397 )
						if( bearPower <= -0.136779 )
							if( bbp <= -0.289354 )
								if( bearPower <= -0.300794 )
									ret := 0.000000
								if( bearPower > -0.300794 )
									ret := 0.777778 // buy
							if( bbp > -0.289354 )
								if( bbp <= -0.204744 )
									ret := -0.791667 // sell
								if( bbp > -0.204744 )
									ret := -0.142857
						if( bearPower > -0.136779 )
							if( ema13 <= 0.05832 )
								if( ema2 <= 37.36 )
									ret := -0.260870
								if( ema2 > 37.36 )
									ret := 0.256410
							if( ema13 > 0.05832 )
								if( ema3 <= 44.5234 )
									ret := -0.500000
								if( ema3 > 44.5234 )
									ret := -1.000000 // sell
					if( ema12 > 0.013397 )
						if( bbp <= -0.127213 )
							if( bearPower <= -0.094594 )
								if( bearPower <= -0.144003 )
									ret := 0.714286 // buy
								if( bearPower > -0.144003 )
									ret := 1.000000 // buy
							if( bearPower > -0.094594 )
								ret := 0.571429
						if( bbp > -0.127213 )
							if( ema3 <= 40.6608 )
								ret := -0.857143 // sell
							if( ema3 > 40.6608 )
								if( bearPower <= -0.048927 )
									ret := 0.777778 // buy
								if( bearPower > -0.048927 )
									ret := 0.153846
			if( bullPower > -0.037427 )
				if( ema3 <= 30.9262 )
					if( ema12 <= 0.019755 )
						if( bearPower <= -0.022835 )
							if( ema3 <= 30.4958 )
								if( ema2 <= 24.1584 )
									ret := -0.750000 // sell
								if( ema2 > 24.1584 )
									ret := 0.133574
							if( ema3 > 30.4958 )
								if( ema12 <= -0.014512 )
									ret := -0.500000
								if( ema12 > -0.014512 )
									ret := 0.519481
						if( bearPower > -0.022835 )
							if( ema12 <= 0.008888 )
								if( ema12 <= 0.003287 )
									ret := 0.385185
								if( ema12 > 0.003287 )
									ret := 0.724138 // buy
							if( ema12 > 0.008888 )
								if( ema1 <= 28.5374 )
									ret := 0.500000
								if( ema1 > 28.5374 )
									ret := -0.133333
					if( ema12 > 0.019755 )
						if( bullPower <= -0.019132 )
							if( bearPower <= -0.025705 )
								if( ema13 <= 0.093549 )
									ret := 0.950000 // buy
								if( ema13 > 0.093549 )
									ret := 0.166667
							if( bearPower > -0.025705 )
								ret := -0.333333
						if( bullPower > -0.019132 )
							if( bbm <= 0.0299 )
								ret := 1.000000 // buy
							if( bbm > 0.0299 )
								ret := 0.750000 // buy
				if( ema3 > 30.9262 )
					if( tema <= 31.4185 )
						if( ema1 <= 31.0437 )
							if( ema1 <= 30.9175 )
								ret := -0.750000 // sell
							if( ema1 > 30.9175 )
								if( ema13 <= -0.010586 )
									ret := 0.571429
								if( ema13 > -0.010586 )
									ret := -0.096774
						if( ema1 > 31.0437 )
							if( tema <= 31.0942 )
								if( tema <= 31.0754 )
									ret := -0.545455
								if( tema > 31.0754 )
									ret := -1.000000 // sell
							if( tema > 31.0942 )
								if( bbp <= -0.064763 )
									ret := -0.354839
								if( bbp > -0.064763 )
									ret := 0.090909
					if( tema > 31.4185 )
						if( ema2 <= 31.5489 )
							if( ema2 <= 31.5127 )
								if( tema <= 31.4518 )
									ret := 0.714286 // buy
								if( tema > 31.4518 )
									ret := 0.200000
							if( ema2 > 31.5127 )
								if( ema13 <= -0.005905 )
									ret := 1.000000 // buy
								if( ema13 > -0.005905 )
									ret := 0.750000 // buy
						if( ema2 > 31.5489 )
							if( ema13 <= -0.025288 )
								if( bearPower <= -0.033462 )
									ret := 0.491228
								if( bearPower > -0.033462 )
									ret := 0.088235
							if( ema13 > -0.025288 )
								if( ema3 <= 31.6097 )
									ret := -0.473684
								if( ema3 > 31.6097 )
									ret := 0.089593
	if( bullPower > -0.012643 )
		if( bbm <= 0.00424 )
			if( bearPower <= 0.048963 )
				if( bullPower <= 0.017154 )
					if( tema <= 26.4213 )
						if( ema12 <= 0.027614 )
							if( ema3 <= 26.4179 )
								if( bbm <= 0.00015 )
									ret := -0.125000
								if( bbm > 0.00015 )
									ret := -1.000000 // sell
							if( ema3 > 26.4179 )
								ret := -1.000000 // sell
						if( ema12 > 0.027614 )
							if( tema <= 24.262 )
								ret := 1.000000 // buy
							if( tema > 24.262 )
								if( bbp <= 0.015182 )
									ret := 0.500000
								if( bbp > 0.015182 )
									ret := 0.000000
					if( tema > 26.4213 )
						if( bbm <= 0.000612 )
							if( tema <= 26.5284 )
								if( ema2 <= 26.4881 )
									ret := 0.000000
								if( ema2 > 26.4881 )
									ret := 1.000000 // buy
							if( tema > 26.5284 )
								if( ema13 <= -0.085558 )
									ret := 0.551724
								if( ema13 > -0.085558 )
									ret := 0.051331
						if( bbm > 0.000612 )
							if( tema <= 41.4986 )
								if( bbp <= -0.025083 )
									ret := -0.166667
								if( bbp > -0.025083 )
									ret := 0.510204
							if( tema > 41.4986 )
								if( bbm <= 0.001456 )
									ret := -0.833333 // sell
								if( bbm > 0.001456 )
									ret := 0.333333
				if( bullPower > 0.017154 )
					if( ema3 <= 33.7189 )
						if( ema3 <= 28.4262 )
							if( bearPower <= 0.041397 )
								if( ema2 <= 26.4423 )
									ret := -0.263158
								if( ema2 > 26.4423 )
									ret := 0.080000
							if( bearPower > 0.041397 )
								if( bbp <= 0.085018 )
									ret := 1.000000 // buy
								if( bbp > 0.085018 )
									ret := 0.171875
						if( ema3 > 28.4262 )
							if( ema3 <= 28.5716 )
								if( tema <= 28.5752 )
									ret := -0.454545
								if( tema > 28.5752 )
									ret := -0.857143 // sell
							if( ema3 > 28.5716 )
								if( ema13 <= 0.090693 )
									ret := -0.195231
								if( ema13 > 0.090693 )
									ret := 0.354839
					if( ema3 > 33.7189 )
						if( ema1 <= 34.4459 )
							if( tema <= 34.0364 )
								if( ema3 <= 33.7606 )
									ret := 0.888889 // buy
								if( ema3 > 33.7606 )
									ret := -0.166667
							if( tema > 34.0364 )
								ret := 1.000000 // buy
						if( ema1 > 34.4459 )
							if( ema3 <= 44.7835 )
								if( ema13 <= 0.061866 )
									ret := 0.051515
								if( ema13 > 0.061866 )
									ret := -0.188406
							if( ema3 > 44.7835 )
								if( bbm <= 0.000187 )
									ret := -0.137500
								if( bbm > 0.000187 )
									ret := -1.000000 // sell
			if( bearPower > 0.048963 )
				if( tema <= 36.6305 )
					if( ema12 <= 0.13479 )
						if( bearPower <= 0.130534 )
							if( ema13 <= 0.063022 )
								if( ema2 <= 30.8622 )
									ret := -0.513253
								if( ema2 > 30.8622 )
									ret := -0.320312
							if( ema13 > 0.063022 )
								if( ema1 <= 35.6143 )
									ret := -0.114078
								if( ema1 > 35.6143 )
									ret := -1.000000 // sell
						if( bearPower > 0.130534 )
							if( ema13 <= 0.053439 )
								if( tema <= 32.3391 )
									ret := -0.910112 // sell
								if( tema > 32.3391 )
									ret := -0.545455
							if( ema13 > 0.053439 )
								if( ema2 <= 24.2484 )
									ret := -1.000000 // sell
								if( ema2 > 24.2484 )
									ret := -0.467337
					if( ema12 > 0.13479 )
						if( bullPower <= 0.195361 )
							if( tema <= 31.2203 )
								ret := 0.285714
							if( tema > 31.2203 )
								if( ema3 <= 32.4032 )
									ret := 1.000000 // buy
								if( ema3 > 32.4032 )
									ret := 0.500000
						if( bullPower > 0.195361 )
							if( ema2 <= 26.9729 )
								if( bullPower <= 0.259445 )
									ret := -0.500000
								if( bullPower > 0.259445 )
									ret := 0.807692 // buy
							if( ema2 > 26.9729 )
								if( bearPower <= 0.259303 )
									ret := -0.071429
								if( bearPower > 0.259303 )
									ret := -0.785714 // sell
				if( tema > 36.6305 )
					if( tema <= 37.2829 )
						if( ema13 <= 0.025032 )
							ret := 0.400000
						if( ema13 > 0.025032 )
							if( ema13 <= 0.254843 )
								if( bearPower <= 0.196008 )
									ret := 1.000000 // buy
								if( bearPower > 0.196008 )
									ret := 0.750000 // buy
							if( ema13 > 0.254843 )
								ret := 0.500000
					if( tema > 37.2829 )
						if( ema12 <= 0.274854 )
							if( ema12 <= 0.176225 )
								if( bbp <= 0.121494 )
									ret := 0.079545
								if( bbp > 0.121494 )
									ret := -0.186094
							if( ema12 > 0.176225 )
								if( bullPower <= 0.226202 )
									ret := -0.250000
								if( bullPower > 0.226202 )
									ret := -0.875000 // sell
						if( ema12 > 0.274854 )
							if( ema2 <= 43.8126 )
								ret := 0.333333
							if( ema2 > 43.8126 )
								ret := 1.000000 // buy
		if( bbm > 0.00424 )
			if( ema2 <= 24.3851 )
				if( ema3 <= 24.3575 )
					if( ema1 <= 24.2493 )
						if( bearPower <= 0.336439 )
							if( bbm <= 0.020784 )
								if( ema2 <= 22.33 )
									ret := 0.900000 // buy
								if( ema2 > 22.33 )
									ret := -0.687500
							if( bbm > 0.020784 )
								if( ema13 <= -0.118896 )
									ret := -0.238095
								if( ema13 > -0.118896 )
									ret := 0.506667
						if( bearPower > 0.336439 )
							if( ema13 <= 0.403136 )
								ret := -0.750000 // sell
							if( ema13 > 0.403136 )
								ret := -1.000000 // sell
					if( ema1 > 24.2493 )
						if( ema12 <= 0.0703 )
							if( ema13 <= 0.043271 )
								if( bbp <= -0.055277 )
									ret := -0.857143 // sell
								if( bbp > -0.055277 )
									ret := 0.421053
							if( ema13 > 0.043271 )
								if( tema <= 24.3693 )
									ret := -0.918919 // sell
								if( tema > 24.3693 )
									ret := -0.382979
						if( ema12 > 0.0703 )
							if( bbm <= 0.095 )
								if( bbp <= 0.248246 )
									ret := 0.375000
								if( bbp > 0.248246 )
									ret := 0.900000 // buy
							if( bbm > 0.095 )
								if( ema13 <= 0.155045 )
									ret := 0.454545
								if( ema13 > 0.155045 )
									ret := -0.700000 // sell
				if( ema3 > 24.3575 )
					if( ema2 <= 24.3535 )
						ret := -0.166667
					if( ema2 > 24.3535 )
						if( ema13 <= -0.020063 )
							ret := 1.000000 // buy
						if( ema13 > -0.020063 )
							if( ema13 <= -0.017826 )
								ret := 0.500000
							if( ema13 > -0.017826 )
								if( ema2 <= 24.3791 )
									ret := 1.000000 // buy
								if( ema2 > 24.3791 )
									ret := 0.750000 // buy
			if( ema2 > 24.3851 )
				if( bbm <= 0.039999 )
					if( bbp <= 0.121344 )
						if( ema2 <= 39.3437 )
							if( bbm <= 0.037932 )
								if( tema <= 39.1869 )
									ret := 0.028792
								if( tema > 39.1869 )
									ret := 0.369565
							if( bbm > 0.037932 )
								if( ema1 <= 29.1949 )
									ret := -0.250000
								if( ema1 > 29.1949 )
									ret := -0.020896
						if( ema2 > 39.3437 )
							if( tema <= 40.9273 )
								if( tema <= 40.653 )
									ret := -0.270073
								if( tema > 40.653 )
									ret := -0.888889 // sell
							if( tema > 40.9273 )
								if( ema2 <= 40.9489 )
									ret := 0.875000 // buy
								if( ema2 > 40.9489 )
									ret := -0.032147
					if( bbp > 0.121344 )
						if( ema12 <= 0.02428 )
							if( bbm <= 0.01019 )
								if( ema2 <= 26.7921 )
									ret := -1.000000 // sell
								if( ema2 > 26.7921 )
									ret := 0.066667
							if( bbm > 0.01019 )
								if( bbm <= 0.014798 )
									ret := -0.900000 // sell
								if( bbm > 0.014798 )
									ret := -0.431818
						if( ema12 > 0.02428 )
							if( bearPower <= 0.394025 )
								if( bbp <= 0.484639 )
									ret := -0.084112
								if( bbp > 0.484639 )
									ret := -0.722222 // sell
							if( bearPower > 0.394025 )
								if( bearPower <= 0.490791 )
									ret := 0.923077 // buy
								if( bearPower > 0.490791 )
									ret := 0.222222
				if( bbm > 0.039999 )
					if( ema3 <= 24.6721 )
						if( ema1 <= 24.5821 )
							if( ema3 <= 24.35 )
								if( tema <= 24.6192 )
									ret := -0.846154 // sell
								if( tema > 24.6192 )
									ret := 0.000000
							if( ema3 > 24.35 )
								if( bullPower <= 0.030609 )
									ret := -0.169014
								if( bullPower > 0.030609 )
									ret := 0.275510
						if( ema1 > 24.5821 )
							if( ema3 <= 24.4505 )
								if( bullPower <= 0.167166 )
									ret := 1.000000 // buy
								if( bullPower > 0.167166 )
									ret := -0.800000 // sell
							if( ema3 > 24.4505 )
								if( ema2 <= 24.6439 )
									ret := -0.736364 // sell
								if( ema2 > 24.6439 )
									ret := -0.185185
					if( ema3 > 24.6721 )
						if( ema3 <= 46.1695 )
							if( tema <= 46.3745 )
								if( tema <= 24.9554 )
									ret := 0.313916
								if( tema > 24.9554 )
									ret := 0.040438
							if( tema > 46.3745 )
								if( bearPower <= 0.137512 )
									ret := -0.666667
								if( bearPower > 0.137512 )
									ret := -0.954545 // sell
						if( ema3 > 46.1695 )
							if( ema3 <= 47.2576 )
								if( ema2 <= 46.5987 )
									ret := 0.705426 // buy
								if( ema2 > 46.5987 )
									ret := 0.294545
							if( ema3 > 47.2576 )
								if( bullPower <= 0.224025 )
									ret := 0.132022
								if( bullPower > 0.224025 )
									ret := -0.400000
	
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


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_AFRM_1Min_7edba046(bullPower, bbp, bearPower, bbm, BBPower_Color, ema3, tema, ema2, ema12, ema13, ema1)

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


