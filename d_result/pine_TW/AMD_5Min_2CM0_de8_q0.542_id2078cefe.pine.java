//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: AMD_5Min_2CM0_2078cefe Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_5Min_2CM0_2078cefe", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_5Min_2078cefe(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( MFI <= 30.8617 )
		if( mf <= -0.390252 )
			if( Positive_Money_Flow_Sum <= 3.54922e+07 )
				if( Negative_Money_Flow_Sum <= 8.57926e+08 )
					if( Raw_Money_Flow <= 3.95751e+08 )
						if( Typical_Price <= 131.313 )
							if( Raw_Money_Flow <= 2.7188e+08 )
								if( ad <= -1.0583e+06 )
									ret := -0.562500
								if( ad > -1.0583e+06 )
									ret := -0.154391
							if( Raw_Money_Flow > 2.7188e+08 )
								if( Negative_Money_Flow <= 2.94666e+08 )
									ret := 0.888889 // buy
								if( Negative_Money_Flow > 2.94666e+08 )
									ret := 0.000000
						if( Typical_Price > 131.313 )
							if( Positive_Money_Flow_Sum <= 1.00713e+06 )
								if( Negative_Money_Flow_Sum <= 2.72873e+06 )
									ret := 0.093023
								if( Negative_Money_Flow_Sum > 2.72873e+06 )
									ret := -0.375000
							if( Positive_Money_Flow_Sum > 1.00713e+06 )
								if( Negative_Money_Flow_Sum <= 3.04736e+07 )
									ret := 0.210526
								if( Negative_Money_Flow_Sum > 3.04736e+07 )
									ret := -0.125000
					if( Raw_Money_Flow > 3.95751e+08 )
						if( mf <= -0.57502 )
							ret := -1.000000 // sell
						if( mf > -0.57502 )
							ret := -0.666667
				if( Negative_Money_Flow_Sum > 8.57926e+08 )
					if( Negative_Money_Flow_Sum <= 2.01253e+09 )
						if( ad <= 545911 )
							if( MFI <= 0.323583 )
								if( MFI <= 0.243435 )
									ret := 0.800000 // buy
								if( MFI > 0.243435 )
									ret := -1.000000 // sell
							if( MFI > 0.323583 )
								if( Typical_Price <= 126.065 )
									ret := 0.923077 // buy
								if( Typical_Price > 126.065 )
									ret := 0.481013
						if( ad > 545911 )
							ret := -0.800000 // sell
					if( Negative_Money_Flow_Sum > 2.01253e+09 )
						if( mf <= -0.463514 )
							ret := -0.833333 // sell
						if( mf > -0.463514 )
							ret := -0.250000
			if( Positive_Money_Flow_Sum > 3.54922e+07 )
				if( MFI <= 6.35299 )
					if( Raw_Money_Flow <= 7.92999e+08 )
						if( Negative_Money_Flow_Sum <= 1.95421e+09 )
							if( Negative_Money_Flow <= 45208.8 )
								ret := -0.250000
							if( Negative_Money_Flow > 45208.8 )
								if( Typical_Price <= 120.101 )
									ret := -0.250000
								if( Typical_Price > 120.101 )
									ret := -0.914286 // sell
						if( Negative_Money_Flow_Sum > 1.95421e+09 )
							if( Typical_Price <= 121.656 )
								ret := -1.000000 // sell
							if( Typical_Price > 121.656 )
								if( Negative_Money_Flow <= 3.96714e+08 )
									ret := 0.000000
								if( Negative_Money_Flow > 3.96714e+08 )
									ret := 0.500000
					if( Raw_Money_Flow > 7.92999e+08 )
						ret := 0.600000
				if( MFI > 6.35299 )
					if( Negative_Money_Flow <= 2.43473e+08 )
						if( MFI_Low <= -6.03762 )
							if( Positive_Money_Flow_Sum <= 2.096e+08 )
								if( Negative_Money_Flow_Sum <= 1.26127e+09 )
									ret := 0.033333
								if( Negative_Money_Flow_Sum > 1.26127e+09 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 2.096e+08 )
								if( Typical_Price <= 162.358 )
									ret := 1.000000 // buy
								if( Typical_Price > 162.358 )
									ret := -0.250000
						if( MFI_Low > -6.03762 )
							if( Typical_Price <= 124.259 )
								if( Positive_Money_Flow_Sum <= 2.58367e+08 )
									ret := -0.142857
								if( Positive_Money_Flow_Sum > 2.58367e+08 )
									ret := 0.714286 // buy
							if( Typical_Price > 124.259 )
								if( Positive_Money_Flow_Sum <= 5.62558e+08 )
									ret := -0.285714
								if( Positive_Money_Flow_Sum > 5.62558e+08 )
									ret := -0.800000 // sell
					if( Negative_Money_Flow > 2.43473e+08 )
						if( Money_Flow_Ratio <= 0.074252 )
							if( Negative_Money_Flow_Sum <= 2.46047e+09 )
								ret := 0.500000
							if( Negative_Money_Flow_Sum > 2.46047e+09 )
								ret := 1.000000 // buy
						if( Money_Flow_Ratio > 0.074252 )
							if( Positive_Money_Flow_Sum <= 6.98481e+08 )
								if( Raw_Money_Flow <= 7.66036e+08 )
									ret := -0.738636 // sell
								if( Raw_Money_Flow > 7.66036e+08 )
									ret := 0.500000
							if( Positive_Money_Flow_Sum > 6.98481e+08 )
								if( MFI_High <= -60.2962 )
									ret := 1.000000 // buy
								if( MFI_High > -60.2962 )
									ret := 0.500000
		if( mf > -0.390252 )
			if( Negative_Money_Flow_Sum <= 3.10243e+09 )
				if( Positive_Money_Flow <= 8.30579e+07 )
					if( MFI_High <= -79.6413 )
						if( mf <= -0.271299 )
							if( mf <= -0.358932 )
								ret := 0.750000 // buy
							if( mf > -0.358932 )
								ret := 1.000000 // buy
						if( mf > -0.271299 )
							ret := 0.000000
					if( MFI_High > -79.6413 )
						if( Negative_Money_Flow_Sum <= 9.71893e+08 )
							if( Typical_Price <= 119.086 )
								if( Negative_Money_Flow_Sum <= 9.10004e+08 )
									ret := -0.025619
								if( Negative_Money_Flow_Sum > 9.10004e+08 )
									ret := 0.627451
							if( Typical_Price > 119.086 )
								if( mf <= -0.04656 )
									ret := 0.130606
								if( mf > -0.04656 )
									ret := 0.018920
						if( Negative_Money_Flow_Sum > 9.71893e+08 )
							if( Positive_Money_Flow_Sum <= 1.72653e+08 )
								if( ad <= 79325.5 )
									ret := -0.424528
								if( ad > 79325.5 )
									ret := 0.142857
							if( Positive_Money_Flow_Sum > 1.72653e+08 )
								if( mf <= -0.290438 )
									ret := 0.175084
								if( mf > -0.290438 )
									ret := -0.043397
				if( Positive_Money_Flow > 8.30579e+07 )
					if( Money_Flow_Ratio <= 0.330028 )
						if( MFI_Low <= -4.57653 )
							if( Positive_Money_Flow <= 2.29164e+08 )
								if( MFI <= 14.6357 )
									ret := 0.197183
								if( MFI > 14.6357 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow > 2.29164e+08 )
								ret := -0.857143 // sell
						if( MFI_Low > -4.57653 )
							if( Positive_Money_Flow_Sum <= 4.83357e+08 )
								if( Raw_Money_Flow <= 2.05602e+08 )
									ret := -0.429864
								if( Raw_Money_Flow > 2.05602e+08 )
									ret := 0.321429
							if( Positive_Money_Flow_Sum > 4.83357e+08 )
								if( Typical_Price <= 139.59 )
									ret := 0.375000
								if( Typical_Price > 139.59 )
									ret := -0.770000 // sell
					if( Money_Flow_Ratio > 0.330028 )
						if( Negative_Money_Flow_Sum <= 1.02873e+09 )
							if( Positive_Money_Flow <= 1.14567e+08 )
								if( ad_mf <= 391190 )
									ret := -0.785714 // sell
								if( ad_mf > 391190 )
									ret := -0.377778
							if( Positive_Money_Flow > 1.14567e+08 )
								if( ad <= 1.37579e+06 )
									ret := 0.166667
								if( ad > 1.37579e+06 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 1.02873e+09 )
							if( Typical_Price <= 142.959 )
								if( mf <= -0.060986 )
									ret := -0.103448
								if( mf > -0.060986 )
									ret := -0.666667
							if( Typical_Price > 142.959 )
								if( Positive_Money_Flow_Sum <= 8.1301e+08 )
									ret := 0.430769
								if( Positive_Money_Flow_Sum > 8.1301e+08 )
									ret := -0.181818
			if( Negative_Money_Flow_Sum > 3.10243e+09 )
				if( Positive_Money_Flow_Sum <= 1.1572e+09 )
					if( Raw_Money_Flow <= 1.47225e+08 )
						ret := -0.500000
					if( Raw_Money_Flow > 1.47225e+08 )
						if( mf <= -0.338267 )
							if( MFI_High <= -57.9917 )
								if( Raw_Money_Flow <= 2.81774e+08 )
									ret := 0.285714
								if( Raw_Money_Flow > 2.81774e+08 )
									ret := 1.000000 // buy
							if( MFI_High > -57.9917 )
								ret := -0.800000 // sell
						if( mf > -0.338267 )
							if( Raw_Money_Flow <= 2.39786e+08 )
								if( Positive_Money_Flow_Sum <= 6.94938e+08 )
									ret := 0.142857
								if( Positive_Money_Flow_Sum > 6.94938e+08 )
									ret := 0.925926 // buy
							if( Raw_Money_Flow > 2.39786e+08 )
								if( Positive_Money_Flow_Sum <= 1.0268e+09 )
									ret := 0.969231 // buy
								if( Positive_Money_Flow_Sum > 1.0268e+09 )
									ret := 0.500000
				if( Positive_Money_Flow_Sum > 1.1572e+09 )
					if( Negative_Money_Flow <= 1.87598e+07 )
						if( Negative_Money_Flow_Sum <= 3.86541e+09 )
							if( Typical_Price <= 166.81 )
								ret := 1.000000 // buy
							if( Typical_Price > 166.81 )
								ret := 0.400000
						if( Negative_Money_Flow_Sum > 3.86541e+09 )
							ret := -1.000000 // sell
					if( Negative_Money_Flow > 1.87598e+07 )
						if( Typical_Price <= 156.697 )
							ret := -1.000000 // sell
						if( Typical_Price > 156.697 )
							if( Typical_Price <= 165.098 )
								ret := 1.000000 // buy
							if( Typical_Price > 165.098 )
								if( Negative_Money_Flow_Sum <= 5.11451e+09 )
									ret := -0.166667
								if( Negative_Money_Flow_Sum > 5.11451e+09 )
									ret := -0.954545 // sell
	if( MFI > 30.8617 )
		if( Positive_Money_Flow_Sum <= 7.43098e+08 )
			if( Positive_Money_Flow_Sum <= 4.02763e+08 )
				if( ad <= -1194.09 )
					if( MFI_High <= -44.1103 )
						if( Raw_Money_Flow <= 5.87965e+07 )
							if( Positive_Money_Flow_Sum <= 1.32972e+08 )
								if( Negative_Money_Flow <= 1.36772e+06 )
									ret := 0.131363
								if( Negative_Money_Flow > 1.36772e+06 )
									ret := 0.403465
							if( Positive_Money_Flow_Sum > 1.32972e+08 )
								if( mf <= -0.253463 )
									ret := 0.400000
								if( mf > -0.253463 )
									ret := -0.026923
						if( Raw_Money_Flow > 5.87965e+07 )
							if( Negative_Money_Flow_Sum <= 7.61855e+08 )
								if( Positive_Money_Flow_Sum <= 2.06723e+08 )
									ret := -0.178571
								if( Positive_Money_Flow_Sum > 2.06723e+08 )
									ret := 0.503731
							if( Negative_Money_Flow_Sum > 7.61855e+08 )
								if( Negative_Money_Flow_Sum <= 8.29697e+08 )
									ret := -0.395833
								if( Negative_Money_Flow_Sum > 8.29697e+08 )
									ret := 0.785714 // buy
					if( MFI_High > -44.1103 )
						if( Negative_Money_Flow <= 1.33474e+08 )
							if( Typical_Price <= 166.692 )
								if( Negative_Money_Flow_Sum <= 4.55971e+08 )
									ret := 0.126743
								if( Negative_Money_Flow_Sum > 4.55971e+08 )
									ret := -0.019841
							if( Typical_Price > 166.692 )
								if( ad_mf <= -45441.3 )
									ret := 0.308411
								if( ad_mf > -45441.3 )
									ret := 0.000000
						if( Negative_Money_Flow > 1.33474e+08 )
							if( ad_mf <= -1.29832e+06 )
								if( Positive_Money_Flow_Sum <= 3.58084e+08 )
									ret := 0.200000
								if( Positive_Money_Flow_Sum > 3.58084e+08 )
									ret := 0.888889 // buy
							if( ad_mf > -1.29832e+06 )
								if( MFI_High <= -26.4936 )
									ret := -0.147059
								if( MFI_High > -26.4936 )
									ret := -0.714286 // sell
				if( ad > -1194.09 )
					if( Negative_Money_Flow_Sum <= 1.38661e+08 )
						if( Typical_Price <= 166.88 )
							if( Negative_Money_Flow_Sum <= 2.49073e+07 )
								if( Raw_Money_Flow <= 2.53582e+06 )
									ret := 0.031565
								if( Raw_Money_Flow > 2.53582e+06 )
									ret := 0.166349
							if( Negative_Money_Flow_Sum > 2.49073e+07 )
								if( MFI_Low <= 41.7388 )
									ret := -0.232295
								if( MFI_Low > 41.7388 )
									ret := 0.050139
						if( Typical_Price > 166.88 )
							if( Negative_Money_Flow_Sum <= 2.08977e+07 )
								if( ad <= 49409.6 )
									ret := 0.004979
								if( ad > 49409.6 )
									ret := -0.511111
							if( Negative_Money_Flow_Sum > 2.08977e+07 )
								if( Negative_Money_Flow_Sum <= 2.47635e+07 )
									ret := -0.540323
								if( Negative_Money_Flow_Sum > 2.47635e+07 )
									ret := -0.107926
					if( Negative_Money_Flow_Sum > 1.38661e+08 )
						if( Raw_Money_Flow <= 2.04011e+07 )
							if( Raw_Money_Flow <= 1.88679e+07 )
								if( ad_mf <= 108005 )
									ret := -0.049751
								if( ad_mf > 108005 )
									ret := 0.888889 // buy
							if( Raw_Money_Flow > 1.88679e+07 )
								if( MFI_High <= -46.0061 )
									ret := 1.000000 // buy
								if( MFI_High > -46.0061 )
									ret := -0.562500
						if( Raw_Money_Flow > 2.04011e+07 )
							if( MFI_Low <= 33.2044 )
								if( Positive_Money_Flow_Sum <= 1.65254e+08 )
									ret := 0.381579
								if( Positive_Money_Flow_Sum > 1.65254e+08 )
									ret := 0.087899
							if( MFI_Low > 33.2044 )
								if( mf <= 0.126981 )
									ret := 0.115435
								if( mf > 0.126981 )
									ret := 0.336315
			if( Positive_Money_Flow_Sum > 4.02763e+08 )
				if( Typical_Price <= 113.315 )
					if( MFI <= 43.0053 )
						if( Positive_Money_Flow_Sum <= 4.60142e+08 )
							if( Typical_Price <= 104.078 )
								if( Money_Flow_Ratio <= 0.544125 )
									ret := 0.580645
								if( Money_Flow_Ratio > 0.544125 )
									ret := 0.053571
							if( Typical_Price > 104.078 )
								if( ad_mf <= 224069 )
									ret := 0.038961
								if( ad_mf > 224069 )
									ret := -0.372549
						if( Positive_Money_Flow_Sum > 4.60142e+08 )
							if( ad <= -772151 )
								if( Money_Flow_Ratio <= 0.539552 )
									ret := 0.727273 // buy
								if( Money_Flow_Ratio > 0.539552 )
									ret := -0.652174
							if( ad > -772151 )
								if( Positive_Money_Flow <= 5.66938e+07 )
									ret := 0.529126
								if( Positive_Money_Flow > 5.66938e+07 )
									ret := 0.203125
					if( MFI > 43.0053 )
						if( Negative_Money_Flow_Sum <= 1.39084e+08 )
							if( Money_Flow_Ratio <= 4.13558 )
								if( Positive_Money_Flow <= 7.75752e+07 )
									ret := 0.618557
								if( Positive_Money_Flow > 7.75752e+07 )
									ret := -0.833333 // sell
							if( Money_Flow_Ratio > 4.13558 )
								if( Positive_Money_Flow <= 2.27835e+08 )
									ret := 0.131086
								if( Positive_Money_Flow > 2.27835e+08 )
									ret := 0.769231 // buy
						if( Negative_Money_Flow_Sum > 1.39084e+08 )
							if( Negative_Money_Flow_Sum <= 2.40046e+08 )
								if( Negative_Money_Flow_Sum <= 1.81784e+08 )
									ret := 0.059633
								if( Negative_Money_Flow_Sum > 1.81784e+08 )
									ret := -0.249400
							if( Negative_Money_Flow_Sum > 2.40046e+08 )
								if( ad <= 644055 )
									ret := 0.090314
								if( ad > 644055 )
									ret := -0.225610
				if( Typical_Price > 113.315 )
					if( Positive_Money_Flow_Sum <= 7.20092e+08 )
						if( mf <= -0.085244 )
							if( Positive_Money_Flow <= 1.14971e+08 )
								if( Money_Flow_Ratio <= 0.486039 )
									ret := 0.042654
								if( Money_Flow_Ratio > 0.486039 )
									ret := -0.201335
							if( Positive_Money_Flow > 1.14971e+08 )
								if( mf <= -0.17062 )
									ret := 0.511905
								if( mf > -0.17062 )
									ret := -0.076190
						if( mf > -0.085244 )
							if( Negative_Money_Flow_Sum <= 3.29788e+07 )
								if( Positive_Money_Flow <= 1.87807e+08 )
									ret := 0.056338
								if( Positive_Money_Flow > 1.87807e+08 )
									ret := -0.467742
							if( Negative_Money_Flow_Sum > 3.29788e+07 )
								if( Negative_Money_Flow <= 6.38278e+07 )
									ret := -0.009550
								if( Negative_Money_Flow > 6.38278e+07 )
									ret := 0.101088
					if( Positive_Money_Flow_Sum > 7.20092e+08 )
						if( Negative_Money_Flow <= 3.63953e+07 )
							if( MFI_High <= -23.4501 )
								if( MFI <= 37.0866 )
									ret := -0.500000
								if( MFI > 37.0866 )
									ret := 0.355769
							if( MFI_High > -23.4501 )
								if( Negative_Money_Flow_Sum <= 1.60873e+08 )
									ret := 0.360000
								if( Negative_Money_Flow_Sum > 1.60873e+08 )
									ret := -0.314433
						if( Negative_Money_Flow > 3.63953e+07 )
							if( Raw_Money_Flow <= 1.04869e+08 )
								if( Positive_Money_Flow_Sum <= 7.38949e+08 )
									ret := -0.602649
								if( Positive_Money_Flow_Sum > 7.38949e+08 )
									ret := -0.117647
							if( Raw_Money_Flow > 1.04869e+08 )
								if( Raw_Money_Flow <= 1.16962e+08 )
									ret := 0.888889 // buy
								if( Raw_Money_Flow > 1.16962e+08 )
									ret := -0.287500
		if( Positive_Money_Flow_Sum > 7.43098e+08 )
			if( Negative_Money_Flow <= 2.54477e+08 )
				if( MFI_Low <= 65.4185 )
					if( Positive_Money_Flow_Sum <= 1.96898e+09 )
						if( mf <= -0.13521 )
							if( Typical_Price <= 181.817 )
								if( ad_mf <= 229429 )
									ret := -0.003460
								if( ad_mf > 229429 )
									ret := -0.344037
							if( Typical_Price > 181.817 )
								if( MFI_Low <= 30.5607 )
									ret := 0.610526
								if( MFI_Low > 30.5607 )
									ret := -0.138889
						if( mf > -0.13521 )
							if( Positive_Money_Flow <= 1.43107e+08 )
								if( MFI <= 83.9034 )
									ret := 0.099047
								if( MFI > 83.9034 )
									ret := -0.293103
							if( Positive_Money_Flow > 1.43107e+08 )
								if( MFI_Low <= 27.4523 )
									ret := 0.495434
								if( MFI_Low > 27.4523 )
									ret := 0.149417
					if( Positive_Money_Flow_Sum > 1.96898e+09 )
						if( MFI_High <= -35.3245 )
							if( Negative_Money_Flow <= 1.66752e+08 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow > 1.66752e+08 )
								ret := 0.000000
						if( MFI_High > -35.3245 )
							if( MFI <= 57.6514 )
								if( ad_mf <= -615103 )
									ret := 0.148148
								if( ad_mf > -615103 )
									ret := -0.587629
							if( MFI > 57.6514 )
								if( mf <= 0.164802 )
									ret := -0.274314
								if( mf > 0.164802 )
									ret := 0.137980
				if( MFI_Low > 65.4185 )
					if( Negative_Money_Flow_Sum <= 2.16666e+08 )
						if( Negative_Money_Flow_Sum <= 5.28326e+07 )
							if( Money_Flow_Ratio <= 78.9845 )
								if( mf <= 0.099589 )
									ret := -0.478261
								if( mf > 0.099589 )
									ret := 0.640000
							if( Money_Flow_Ratio > 78.9845 )
								if( Raw_Money_Flow <= 1.34296e+08 )
									ret := 0.583333
								if( Raw_Money_Flow > 1.34296e+08 )
									ret := -0.014706
						if( Negative_Money_Flow_Sum > 5.28326e+07 )
							if( Typical_Price <= 110.136 )
								if( Positive_Money_Flow_Sum <= 1.15985e+09 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 1.15985e+09 )
									ret := 0.618182
							if( Typical_Price > 110.136 )
								if( ad <= 137452 )
									ret := 0.032922
								if( ad > 137452 )
									ret := -0.272727
					if( Negative_Money_Flow_Sum > 2.16666e+08 )
						if( Positive_Money_Flow_Sum <= 2.89323e+09 )
							if( Positive_Money_Flow_Sum <= 2.67311e+09 )
								if( Typical_Price <= 159.812 )
									ret := 0.728070 // buy
								if( Typical_Price > 159.812 )
									ret := 0.254237
							if( Positive_Money_Flow_Sum > 2.67311e+09 )
								if( Raw_Money_Flow <= 2.14159e+08 )
									ret := 0.500000
								if( Raw_Money_Flow > 2.14159e+08 )
									ret := -0.923077 // sell
						if( Positive_Money_Flow_Sum > 2.89323e+09 )
							if( Typical_Price <= 174.437 )
								if( Raw_Money_Flow <= 3.11024e+08 )
									ret := 0.978261 // buy
								if( Raw_Money_Flow > 3.11024e+08 )
									ret := 0.800000 // buy
							if( Typical_Price > 174.437 )
								if( mf <= 0.295674 )
									ret := 0.888889 // buy
								if( mf > 0.295674 )
									ret := -0.400000
			if( Negative_Money_Flow > 2.54477e+08 )
				if( Typical_Price <= 211.489 )
					if( Typical_Price <= 147.569 )
						if( MFI_Low <= 61.676 )
							if( ad_mf <= 1.2942e+06 )
								if( ad_mf <= -647232 )
									ret := 0.151515
								if( ad_mf > -647232 )
									ret := 0.900000 // buy
							if( ad_mf > 1.2942e+06 )
								ret := -0.600000
						if( MFI_Low > 61.676 )
							ret := -1.000000 // sell
					if( Typical_Price > 147.569 )
						if( Positive_Money_Flow_Sum <= 2.12962e+09 )
							if( Positive_Money_Flow_Sum <= 1.22548e+09 )
								if( Money_Flow_Ratio <= 1.70838 )
									ret := 0.168421
								if( Money_Flow_Ratio > 1.70838 )
									ret := -0.894737 // sell
							if( Positive_Money_Flow_Sum > 1.22548e+09 )
								if( Typical_Price <= 171.958 )
									ret := -0.800000 // sell
								if( Typical_Price > 171.958 )
									ret := -0.271186
						if( Positive_Money_Flow_Sum > 2.12962e+09 )
							if( Negative_Money_Flow_Sum <= 2.49073e+09 )
								if( Money_Flow_Ratio <= 1.38288 )
									ret := 0.818182 // buy
								if( Money_Flow_Ratio > 1.38288 )
									ret := 0.051282
							if( Negative_Money_Flow_Sum > 2.49073e+09 )
								if( MFI_Low <= 18.9197 )
									ret := 0.555556
								if( MFI_Low > 18.9197 )
									ret := -0.666667
				if( Typical_Price > 211.489 )
					ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_AMD_5Min_2078cefe(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


