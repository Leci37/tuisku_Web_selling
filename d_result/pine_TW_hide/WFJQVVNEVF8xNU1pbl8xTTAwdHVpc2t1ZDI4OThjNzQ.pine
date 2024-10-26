//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: XRPUSDT_15Min_1M00_d2898c74 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_15Min_1M00_d2898c74", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_15Min_d2898c74(Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow_Sum <= 1.85795e+07 )
		if( Typical_Price <= 0.462232 )
			if( Raw_Money_Flow <= 2.87364e+06 )
				if( Negative_Money_Flow <= 1.98869e+06 )
					if( Negative_Money_Flow <= 1.3432e+06 )
						if( Positive_Money_Flow_Sum <= 1.1809e+07 )
							if( Negative_Money_Flow_Sum <= 8.10719e+06 )
								if( Raw_Money_Flow <= 838079 )
									ret := 0.037939
								if( Raw_Money_Flow > 838079 )
									ret := -0.054630
							if( Negative_Money_Flow_Sum > 8.10719e+06 )
								if( MFI <= 43.1119 )
									ret := 0.028787
								if( MFI > 43.1119 )
									ret := 0.136741
						if( Positive_Money_Flow_Sum > 1.1809e+07 )
							if( Raw_Money_Flow <= 1.24507e+06 )
								if( Raw_Money_Flow <= 625321 )
									ret := -0.114035
								if( Raw_Money_Flow > 625321 )
									ret := 0.232176
							if( Raw_Money_Flow > 1.24507e+06 )
								if( Negative_Money_Flow_Sum <= 1.76554e+07 )
									ret := 0.053360
								if( Negative_Money_Flow_Sum > 1.76554e+07 )
									ret := -0.373494
					if( Negative_Money_Flow > 1.3432e+06 )
						if( MFI_Low <= 39.5706 )
							if( Positive_Money_Flow_Sum <= 2.0078e+07 )
								if( Negative_Money_Flow_Sum <= 1.85006e+07 )
									ret := 0.111607
								if( Negative_Money_Flow_Sum > 1.85006e+07 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 2.0078e+07 )
								if( Negative_Money_Flow_Sum <= 1.65742e+07 )
									ret := -0.384615
								if( Negative_Money_Flow_Sum > 1.65742e+07 )
									ret := -0.928571 // sell
						if( MFI_Low > 39.5706 )
							if( Negative_Money_Flow_Sum <= 9.3627e+06 )
								if( Money_Flow_Ratio <= 2.85177 )
									ret := 0.185279
								if( Money_Flow_Ratio > 2.85177 )
									ret := -0.080645
							if( Negative_Money_Flow_Sum > 9.3627e+06 )
								if( Positive_Money_Flow_Sum <= 2.51926e+07 )
									ret := 0.649573
								if( Positive_Money_Flow_Sum > 2.51926e+07 )
									ret := 0.316832
				if( Negative_Money_Flow > 1.98869e+06 )
					if( MFI_High <= -44.8894 )
						if( Money_Flow_Ratio <= 0.343303 )
							if( Positive_Money_Flow_Sum <= 3.87303e+06 )
								if( MFI <= 18.4713 )
									ret := -0.231884
								if( MFI > 18.4713 )
									ret := 0.413043
							if( Positive_Money_Flow_Sum > 3.87303e+06 )
								if( MFI_Low <= 4.48773 )
									ret := -0.291667
								if( MFI_Low > 4.48773 )
									ret := -0.850000 // sell
						if( Money_Flow_Ratio > 0.343303 )
							if( Money_Flow_Ratio <= 0.450563 )
								if( Negative_Money_Flow_Sum <= 1.68082e+07 )
									ret := 0.610526
								if( Negative_Money_Flow_Sum > 1.68082e+07 )
									ret := 0.142857
							if( Money_Flow_Ratio > 0.450563 )
								if( Typical_Price <= 0.332785 )
									ret := -1.000000 // sell
								if( Typical_Price > 0.332785 )
									ret := 0.198198
					if( MFI_High > -44.8894 )
						if( MFI_High <= -14.4765 )
							if( Typical_Price <= 0.344015 )
								if( Money_Flow_Ratio <= 0.61265 )
									ret := -0.888889 // sell
								if( Money_Flow_Ratio > 0.61265 )
									ret := 0.473684
							if( Typical_Price > 0.344015 )
								if( Raw_Money_Flow <= 2.54117e+06 )
									ret := -0.164474
								if( Raw_Money_Flow > 2.54117e+06 )
									ret := 0.018605
						if( MFI_High > -14.4765 )
							if( Typical_Price <= 0.424202 )
								if( Typical_Price <= 0.34348 )
									ret := 0.272727
								if( Typical_Price > 0.34348 )
									ret := -0.487805
							if( Typical_Price > 0.424202 )
								if( MFI_High <= -13.3861 )
									ret := -0.666667
								if( MFI_High > -13.3861 )
									ret := 0.142857
			if( Raw_Money_Flow > 2.87364e+06 )
				if( Positive_Money_Flow_Sum <= 3.56148e+07 )
					if( Money_Flow_Ratio <= 0.22417 )
						if( Negative_Money_Flow_Sum <= 1.43448e+07 )
							if( Negative_Money_Flow_Sum <= 1.04597e+07 )
								ret := -0.500000
							if( Negative_Money_Flow_Sum > 1.04597e+07 )
								if( Raw_Money_Flow <= 3.62897e+06 )
									ret := 0.500000
								if( Raw_Money_Flow > 3.62897e+06 )
									ret := 0.000000
						if( Negative_Money_Flow_Sum > 1.43448e+07 )
							if( Negative_Money_Flow_Sum <= 1.59435e+07 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.59435e+07 )
								if( Typical_Price <= 0.400972 )
									ret := -0.333333
								if( Typical_Price > 0.400972 )
									ret := -0.857143 // sell
					if( Money_Flow_Ratio > 0.22417 )
						if( Positive_Money_Flow_Sum <= 7.22818e+06 )
							if( Negative_Money_Flow <= 3.24902e+06 )
								if( MFI_High <= -41.7139 )
									ret := 0.761905 // buy
								if( MFI_High > -41.7139 )
									ret := 0.062500
							if( Negative_Money_Flow > 3.24902e+06 )
								if( Raw_Money_Flow <= 4.57959e+06 )
									ret := 0.195489
								if( Raw_Money_Flow > 4.57959e+06 )
									ret := 0.614286
						if( Positive_Money_Flow_Sum > 7.22818e+06 )
							if( Positive_Money_Flow_Sum <= 8.36696e+06 )
								if( Negative_Money_Flow <= 1.45794e+06 )
									ret := -0.814815 // sell
								if( Negative_Money_Flow > 1.45794e+06 )
									ret := -0.021739
							if( Positive_Money_Flow_Sum > 8.36696e+06 )
								if( Positive_Money_Flow_Sum <= 2.84889e+07 )
									ret := 0.162162
								if( Positive_Money_Flow_Sum > 2.84889e+07 )
									ret := 0.415842
				if( Positive_Money_Flow_Sum > 3.56148e+07 )
					if( Negative_Money_Flow_Sum <= 1.27778e+07 )
						if( MFI_Low <= 57.5397 )
							ret := -1.000000 // sell
						if( MFI_Low > 57.5397 )
							if( Positive_Money_Flow <= 3.33477e+06 )
								if( MFI <= 79.434 )
									ret := -0.750000 // sell
								if( MFI > 79.434 )
									ret := 0.270270
							if( Positive_Money_Flow > 3.33477e+06 )
								if( Typical_Price <= 0.448927 )
									ret := -0.500000
								if( Typical_Price > 0.448927 )
									ret := 0.103448
					if( Negative_Money_Flow_Sum > 1.27778e+07 )
						if( Positive_Money_Flow_Sum <= 5.1015e+07 )
							if( Positive_Money_Flow_Sum <= 3.80703e+07 )
								if( Negative_Money_Flow <= 5.76529e+06 )
									ret := -0.727273 // sell
								if( Negative_Money_Flow > 5.76529e+06 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 3.80703e+07 )
								if( Negative_Money_Flow <= 5.05284e+06 )
									ret := 0.692308
								if( Negative_Money_Flow > 5.05284e+06 )
									ret := -0.200000
						if( Positive_Money_Flow_Sum > 5.1015e+07 )
							if( Money_Flow_Ratio <= 3.89952 )
								if( Positive_Money_Flow_Sum <= 5.76864e+07 )
									ret := -0.400000
								if( Positive_Money_Flow_Sum > 5.76864e+07 )
									ret := -1.000000 // sell
							if( Money_Flow_Ratio > 3.89952 )
								if( Positive_Money_Flow <= 2.54475e+06 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow > 2.54475e+06 )
									ret := 0.333333
		if( Typical_Price > 0.462232 )
			if( MFI <= 83.7145 )
				if( Positive_Money_Flow <= 3.39073e+06 )
					if( Positive_Money_Flow_Sum <= 1.20307e+07 )
						if( Raw_Money_Flow <= 3.51661e+06 )
							if( Negative_Money_Flow_Sum <= 9.91511e+06 )
								if( Negative_Money_Flow_Sum <= 3.24182e+06 )
									ret := 0.020507
								if( Negative_Money_Flow_Sum > 3.24182e+06 )
									ret := -0.035308
							if( Negative_Money_Flow_Sum > 9.91511e+06 )
								if( Typical_Price <= 0.525588 )
									ret := 0.059549
								if( Typical_Price > 0.525588 )
									ret := -0.049583
						if( Raw_Money_Flow > 3.51661e+06 )
							if( Negative_Money_Flow_Sum <= 1.79157e+07 )
								if( Negative_Money_Flow_Sum <= 1.10364e+07 )
									ret := -0.064935
								if( Negative_Money_Flow_Sum > 1.10364e+07 )
									ret := 0.275204
							if( Negative_Money_Flow_Sum > 1.79157e+07 )
								if( Negative_Money_Flow <= 3.76611e+06 )
									ret := 0.571429
								if( Negative_Money_Flow > 3.76611e+06 )
									ret := -0.333333
					if( Positive_Money_Flow_Sum > 1.20307e+07 )
						if( Typical_Price <= 0.568423 )
							if( Raw_Money_Flow <= 1.84391e+06 )
								if( Positive_Money_Flow <= 1.40032e+06 )
									ret := 0.060925
								if( Positive_Money_Flow > 1.40032e+06 )
									ret := 0.169924
							if( Raw_Money_Flow > 1.84391e+06 )
								if( Positive_Money_Flow_Sum <= 1.31234e+07 )
									ret := 0.195000
								if( Positive_Money_Flow_Sum > 1.31234e+07 )
									ret := -0.007099
						if( Typical_Price > 0.568423 )
							if( Money_Flow_Ratio <= 1.54085 )
								if( Typical_Price <= 0.638318 )
									ret := 0.019166
								if( Typical_Price > 0.638318 )
									ret := 0.214936
							if( Money_Flow_Ratio > 1.54085 )
								if( Negative_Money_Flow <= 4.64596e+06 )
									ret := -0.071962
								if( Negative_Money_Flow > 4.64596e+06 )
									ret := 0.391304
				if( Positive_Money_Flow > 3.39073e+06 )
					if( Raw_Money_Flow <= 7.98916e+06 )
						if( Money_Flow_Ratio <= 0.745102 )
							if( MFI_High <= -39.2111 )
								if( MFI_High <= -43.5857 )
									ret := 0.500000
								if( MFI_High > -43.5857 )
									ret := -0.076923
							if( MFI_High > -39.2111 )
								if( MFI <= 42.4046 )
									ret := 1.000000 // buy
								if( MFI > 42.4046 )
									ret := 0.500000
						if( Money_Flow_Ratio > 0.745102 )
							if( Positive_Money_Flow_Sum <= 5.58644e+07 )
								if( Positive_Money_Flow_Sum <= 4.47749e+07 )
									ret := -0.139520
								if( Positive_Money_Flow_Sum > 4.47749e+07 )
									ret := -0.551282
							if( Positive_Money_Flow_Sum > 5.58644e+07 )
								if( Positive_Money_Flow_Sum <= 6.67999e+07 )
									ret := 0.644444
								if( Positive_Money_Flow_Sum > 6.67999e+07 )
									ret := -0.600000
					if( Raw_Money_Flow > 7.98916e+06 )
						if( Typical_Price <= 0.495912 )
							if( Raw_Money_Flow <= 1.57303e+07 )
								if( Positive_Money_Flow_Sum <= 2.12759e+07 )
									ret := -0.100000
								if( Positive_Money_Flow_Sum > 2.12759e+07 )
									ret := -0.750000 // sell
							if( Raw_Money_Flow > 1.57303e+07 )
								ret := 0.400000
						if( Typical_Price > 0.495912 )
							if( Positive_Money_Flow_Sum <= 2.78549e+07 )
								if( MFI_High <= -23.2708 )
									ret := -1.000000 // sell
								if( MFI_High > -23.2708 )
									ret := 0.654762
							if( Positive_Money_Flow_Sum > 2.78549e+07 )
								if( Negative_Money_Flow_Sum <= 9.0808e+06 )
									ret := -0.441176
								if( Negative_Money_Flow_Sum > 9.0808e+06 )
									ret := 0.215190
			if( MFI > 83.7145 )
				if( Positive_Money_Flow_Sum <= 4.73579e+07 )
					if( Negative_Money_Flow_Sum <= 7.10779e+06 )
						if( Positive_Money_Flow_Sum <= 4.01322e+07 )
							if( Positive_Money_Flow_Sum <= 2.91926e+07 )
								if( Positive_Money_Flow_Sum <= 2.565e+07 )
									ret := -0.110687
								if( Positive_Money_Flow_Sum > 2.565e+07 )
									ret := -0.510638
							if( Positive_Money_Flow_Sum > 2.91926e+07 )
								if( Typical_Price <= 0.516102 )
									ret := 0.450000
								if( Typical_Price > 0.516102 )
									ret := -0.049505
						if( Positive_Money_Flow_Sum > 4.01322e+07 )
							if( Raw_Money_Flow <= 2.64162e+06 )
								if( MFI_Low <= 67.5243 )
									ret := -0.750000 // sell
								if( MFI_Low > 67.5243 )
									ret := 0.222222
							if( Raw_Money_Flow > 2.64162e+06 )
								if( Money_Flow_Ratio <= 7.08805 )
									ret := 0.230769
								if( Money_Flow_Ratio > 7.08805 )
									ret := 0.733333 // buy
					if( Negative_Money_Flow_Sum > 7.10779e+06 )
						if( Raw_Money_Flow <= 6.72809e+06 )
							if( Positive_Money_Flow_Sum <= 4.05063e+07 )
								ret := -0.333333
							if( Positive_Money_Flow_Sum > 4.05063e+07 )
								if( Positive_Money_Flow_Sum <= 4.60301e+07 )
									ret := -0.920000 // sell
								if( Positive_Money_Flow_Sum > 4.60301e+07 )
									ret := -0.500000
						if( Raw_Money_Flow > 6.72809e+06 )
							if( Typical_Price <= 0.549497 )
								ret := -1.000000 // sell
							if( Typical_Price > 0.549497 )
								ret := 0.400000
				if( Positive_Money_Flow_Sum > 4.73579e+07 )
					if( Positive_Money_Flow_Sum <= 1.97583e+08 )
						if( Positive_Money_Flow <= 1.96894e+07 )
							if( MFI_Low <= 64.9509 )
								if( Positive_Money_Flow_Sum <= 8.4891e+07 )
									ret := 0.222222
								if( Positive_Money_Flow_Sum > 8.4891e+07 )
									ret := -0.555556
							if( MFI_Low > 64.9509 )
								if( Raw_Money_Flow <= 1.74351e+07 )
									ret := -0.447115
								if( Raw_Money_Flow > 1.74351e+07 )
									ret := 0.444444
						if( Positive_Money_Flow > 1.96894e+07 )
							if( Typical_Price <= 0.501382 )
								ret := 0.500000
							if( Typical_Price > 0.501382 )
								if( MFI <= 94.212 )
									ret := -0.779661 // sell
								if( MFI > 94.212 )
									ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 1.97583e+08 )
						if( Typical_Price <= 0.612859 )
							ret := 1.000000 // buy
						if( Typical_Price > 0.612859 )
							ret := 0.000000
	if( Negative_Money_Flow_Sum > 1.85795e+07 )
		if( MFI_Low <= 20.7182 )
			if( Negative_Money_Flow <= 7.8425e+06 )
				if( Typical_Price <= 0.600283 )
					if( Positive_Money_Flow_Sum <= 1.55757e+07 )
						if( Positive_Money_Flow_Sum <= 1.3038e+07 )
							if( MFI <= 36.0797 )
								if( Negative_Money_Flow_Sum <= 5.59355e+07 )
									ret := 0.191465
								if( Negative_Money_Flow_Sum > 5.59355e+07 )
									ret := 0.741935 // buy
							if( MFI > 36.0797 )
								if( Raw_Money_Flow <= 1.38624e+06 )
									ret := 0.034091
								if( Raw_Money_Flow > 1.38624e+06 )
									ret := 0.574913
						if( Positive_Money_Flow_Sum > 1.3038e+07 )
							if( Positive_Money_Flow <= 3.32545e+06 )
								if( Negative_Money_Flow_Sum <= 2.07383e+07 )
									ret := 0.447059
								if( Negative_Money_Flow_Sum > 2.07383e+07 )
									ret := -0.025116
							if( Positive_Money_Flow > 3.32545e+06 )
								if( MFI_High <= -43.714 )
									ret := 0.527273
								if( MFI_High > -43.714 )
									ret := -0.269231
					if( Positive_Money_Flow_Sum > 1.55757e+07 )
						if( Positive_Money_Flow_Sum <= 1.88316e+07 )
							if( Typical_Price <= 0.567844 )
								if( Raw_Money_Flow <= 5.73899e+06 )
									ret := 0.508571
								if( Raw_Money_Flow > 5.73899e+06 )
									ret := 0.025000
							if( Typical_Price > 0.567844 )
								if( Positive_Money_Flow_Sum <= 1.59162e+07 )
									ret := 0.756098 // buy
								if( Positive_Money_Flow_Sum > 1.59162e+07 )
									ret := 0.040609
						if( Positive_Money_Flow_Sum > 1.88316e+07 )
							if( Negative_Money_Flow_Sum <= 3.8982e+07 )
								if( MFI_Low <= 17.15 )
									ret := -0.348214
								if( MFI_Low > 17.15 )
									ret := 0.171429
							if( Negative_Money_Flow_Sum > 3.8982e+07 )
								if( Raw_Money_Flow <= 5.77258e+06 )
									ret := 0.362147
								if( Raw_Money_Flow > 5.77258e+06 )
									ret := 0.081678
				if( Typical_Price > 0.600283 )
					if( Positive_Money_Flow_Sum <= 1.97889e+07 )
						if( Negative_Money_Flow_Sum <= 5.56451e+07 )
							if( Positive_Money_Flow_Sum <= 1.11763e+07 )
								if( MFI_High <= -56.2299 )
									ret := 0.031785
								if( MFI_High > -56.2299 )
									ret := -0.147940
							if( Positive_Money_Flow_Sum > 1.11763e+07 )
								if( Negative_Money_Flow <= 4.95708e+06 )
									ret := 0.076517
								if( Negative_Money_Flow > 4.95708e+06 )
									ret := -0.315789
						if( Negative_Money_Flow_Sum > 5.56451e+07 )
							if( MFI_High <= -69.2597 )
								if( Negative_Money_Flow <= 4.87063e+06 )
									ret := 0.000000
								if( Negative_Money_Flow > 4.87063e+06 )
									ret := 0.800000 // buy
							if( MFI_High > -69.2597 )
								if( MFI <= 17.6218 )
									ret := -0.741379 // sell
								if( MFI > 17.6218 )
									ret := -0.142857
					if( Positive_Money_Flow_Sum > 1.97889e+07 )
						if( Raw_Money_Flow <= 1.6887e+07 )
							if( Negative_Money_Flow_Sum <= 1.52794e+08 )
								if( Positive_Money_Flow_Sum <= 6.2331e+07 )
									ret := 0.234809
								if( Positive_Money_Flow_Sum > 6.2331e+07 )
									ret := -0.475000
							if( Negative_Money_Flow_Sum > 1.52794e+08 )
								if( Positive_Money_Flow_Sum <= 7.28214e+07 )
									ret := 0.625000
								if( Positive_Money_Flow_Sum > 7.28214e+07 )
									ret := 1.000000 // buy
						if( Raw_Money_Flow > 1.6887e+07 )
							if( Money_Flow_Ratio <= 0.494396 )
								ret := -0.750000 // sell
							if( Money_Flow_Ratio > 0.494396 )
								ret := -1.000000 // sell
			if( Negative_Money_Flow > 7.8425e+06 )
				if( MFI_Low <= -8.90106 )
					if( Raw_Money_Flow <= 8.14059e+06 )
						ret := 0.200000
					if( Raw_Money_Flow > 8.14059e+06 )
						if( Negative_Money_Flow_Sum <= 5.785e+07 )
							if( Negative_Money_Flow <= 2.41075e+07 )
								if( Typical_Price <= 0.595027 )
									ret := 0.851064 // buy
								if( Typical_Price > 0.595027 )
									ret := 0.500000
							if( Negative_Money_Flow > 2.41075e+07 )
								ret := 0.000000
						if( Negative_Money_Flow_Sum > 5.785e+07 )
							if( Positive_Money_Flow_Sum <= 4.613e+06 )
								if( Typical_Price <= 0.507707 )
									ret := 1.000000 // buy
								if( Typical_Price > 0.507707 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 4.613e+06 )
								if( Typical_Price <= 0.458058 )
									ret := 0.500000
								if( Typical_Price > 0.458058 )
									ret := 0.968254 // buy
				if( MFI_Low > -8.90106 )
					if( Positive_Money_Flow_Sum <= 1.82408e+07 )
						if( Raw_Money_Flow <= 8.14072e+06 )
							if( Negative_Money_Flow <= 7.88541e+06 )
								if( Raw_Money_Flow <= 7.85916e+06 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 7.85916e+06 )
									ret := -0.250000
							if( Negative_Money_Flow > 7.88541e+06 )
								if( Typical_Price <= 0.6178 )
									ret := 0.914286 // buy
								if( Typical_Price > 0.6178 )
									ret := 0.000000
						if( Raw_Money_Flow > 8.14072e+06 )
							if( Raw_Money_Flow <= 2.4779e+07 )
								if( Negative_Money_Flow_Sum <= 6.94392e+07 )
									ret := 0.224490
								if( Negative_Money_Flow_Sum > 6.94392e+07 )
									ret := -0.483871
							if( Raw_Money_Flow > 2.4779e+07 )
								if( MFI <= 12.592 )
									ret := 0.000000
								if( MFI > 12.592 )
									ret := 0.961538 // buy
					if( Positive_Money_Flow_Sum > 1.82408e+07 )
						if( Typical_Price <= 0.72425 )
							if( Positive_Money_Flow_Sum <= 9.01509e+07 )
								if( Negative_Money_Flow <= 2.28623e+07 )
									ret := 0.628205
								if( Negative_Money_Flow > 2.28623e+07 )
									ret := 0.328571
							if( Positive_Money_Flow_Sum > 9.01509e+07 )
								ret := -1.000000 // sell
						if( Typical_Price > 0.72425 )
							if( Typical_Price <= 0.728754 )
								ret := -1.000000 // sell
							if( Typical_Price > 0.728754 )
								if( Positive_Money_Flow_Sum <= 5.28497e+07 )
									ret := 0.050000
								if( Positive_Money_Flow_Sum > 5.28497e+07 )
									ret := 1.000000 // buy
		if( MFI_Low > 20.7182 )
			if( Negative_Money_Flow_Sum <= 6.13045e+07 )
				if( Typical_Price <= 0.531519 )
					if( Negative_Money_Flow_Sum <= 2.39341e+07 )
						if( Positive_Money_Flow <= 3.40758e+06 )
							if( Negative_Money_Flow_Sum <= 2.38176e+07 )
								if( Positive_Money_Flow_Sum <= 1.96258e+07 )
									ret := 0.187050
								if( Positive_Money_Flow_Sum > 1.96258e+07 )
									ret := 0.032374
							if( Negative_Money_Flow_Sum > 2.38176e+07 )
								if( MFI <= 47.2577 )
									ret := -1.000000 // sell
								if( MFI > 47.2577 )
									ret := -0.250000
						if( Positive_Money_Flow > 3.40758e+06 )
							if( Positive_Money_Flow <= 4.23972e+06 )
								if( Negative_Money_Flow_Sum <= 2.09258e+07 )
									ret := -0.701493 // sell
								if( Negative_Money_Flow_Sum > 2.09258e+07 )
									ret := -0.333333
							if( Positive_Money_Flow > 4.23972e+06 )
								if( MFI <= 58.7975 )
									ret := 0.348837
								if( MFI > 58.7975 )
									ret := -0.132530
					if( Negative_Money_Flow_Sum > 2.39341e+07 )
						if( Positive_Money_Flow <= 3.93841e+06 )
							if( Positive_Money_Flow_Sum <= 2.04473e+07 )
								if( Positive_Money_Flow_Sum <= 1.84487e+07 )
									ret := 0.576923
								if( Positive_Money_Flow_Sum > 1.84487e+07 )
									ret := -0.450549
							if( Positive_Money_Flow_Sum > 2.04473e+07 )
								if( Positive_Money_Flow_Sum <= 4.23837e+07 )
									ret := 0.353304
								if( Positive_Money_Flow_Sum > 4.23837e+07 )
									ret := 0.117048
						if( Positive_Money_Flow > 3.93841e+06 )
							if( Negative_Money_Flow_Sum <= 3.24618e+07 )
								if( Raw_Money_Flow <= 8.57447e+06 )
									ret := -0.438710
								if( Raw_Money_Flow > 8.57447e+06 )
									ret := 0.343750
							if( Negative_Money_Flow_Sum > 3.24618e+07 )
								if( Money_Flow_Ratio <= 0.732558 )
									ret := -0.631579
								if( Money_Flow_Ratio > 0.732558 )
									ret := 0.353712
				if( Typical_Price > 0.531519 )
					if( Positive_Money_Flow_Sum <= 1.47224e+07 )
						if( Positive_Money_Flow_Sum <= 1.39634e+07 )
							if( Positive_Money_Flow <= 758477 )
								if( Raw_Money_Flow <= 1.99294e+06 )
									ret := 0.619048
								if( Raw_Money_Flow > 1.99294e+06 )
									ret := -0.444444
							if( Positive_Money_Flow > 758477 )
								if( Positive_Money_Flow <= 1.41841e+06 )
									ret := -0.714286 // sell
								if( Positive_Money_Flow > 1.41841e+06 )
									ret := 0.000000
						if( Positive_Money_Flow_Sum > 1.39634e+07 )
							if( Typical_Price <= 0.544643 )
								if( MFI_Low <= 22.6499 )
									ret := -0.600000
								if( MFI_Low > 22.6499 )
									ret := 0.200000
							if( Typical_Price > 0.544643 )
								if( Positive_Money_Flow_Sum <= 1.4111e+07 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 1.4111e+07 )
									ret := -0.636364
					if( Positive_Money_Flow_Sum > 1.47224e+07 )
						if( Typical_Price <= 0.833167 )
							if( Positive_Money_Flow_Sum <= 5.52627e+07 )
								if( Negative_Money_Flow <= 9.24998e+06 )
									ret := 0.035829
								if( Negative_Money_Flow > 9.24998e+06 )
									ret := 0.525253
							if( Positive_Money_Flow_Sum > 5.52627e+07 )
								if( Positive_Money_Flow_Sum <= 1.12161e+08 )
									ret := -0.146365
								if( Positive_Money_Flow_Sum > 1.12161e+08 )
									ret := 0.301282
						if( Typical_Price > 0.833167 )
							if( Negative_Money_Flow <= 6.88423e+06 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow > 6.88423e+06 )
								ret := -0.750000 // sell
			if( Negative_Money_Flow_Sum > 6.13045e+07 )
				if( MFI_High <= -35.748 )
					if( Typical_Price <= 0.581815 )
						if( Negative_Money_Flow_Sum <= 9.86494e+07 )
							if( Negative_Money_Flow <= 863854 )
								if( Raw_Money_Flow <= 8.18159e+06 )
									ret := -0.687500
								if( Raw_Money_Flow > 8.18159e+06 )
									ret := 0.333333
							if( Negative_Money_Flow > 863854 )
								if( Raw_Money_Flow <= 8.38658e+06 )
									ret := 0.928571 // buy
								if( Raw_Money_Flow > 8.38658e+06 )
									ret := 0.000000
						if( Negative_Money_Flow_Sum > 9.86494e+07 )
							if( Typical_Price <= 0.551952 )
								ret := -1.000000 // sell
							if( Typical_Price > 0.551952 )
								ret := -0.200000
					if( Typical_Price > 0.581815 )
						if( Money_Flow_Ratio <= 0.736682 )
							if( Negative_Money_Flow_Sum <= 7.01906e+07 )
								if( Money_Flow_Ratio <= 0.702134 )
									ret := -0.500000
								if( Money_Flow_Ratio > 0.702134 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 7.01906e+07 )
								if( Negative_Money_Flow <= 1.06541e+07 )
									ret := 0.428571
								if( Negative_Money_Flow > 1.06541e+07 )
									ret := -0.714286 // sell
						if( Money_Flow_Ratio > 0.736682 )
							if( Negative_Money_Flow <= 6.1038e+06 )
								if( Positive_Money_Flow_Sum <= 6.04187e+07 )
									ret := -0.062500
								if( Positive_Money_Flow_Sum > 6.04187e+07 )
									ret := 0.900000 // buy
							if( Negative_Money_Flow > 6.1038e+06 )
								if( Raw_Money_Flow <= 1.61073e+07 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 1.61073e+07 )
									ret := 0.777778 // buy
				if( MFI_High > -35.748 )
					if( Raw_Money_Flow <= 1.42034e+07 )
						if( MFI_High <= -25.1798 )
							if( Negative_Money_Flow <= 716385 )
								if( Positive_Money_Flow_Sum <= 1.08965e+08 )
									ret := -0.593985
								if( Positive_Money_Flow_Sum > 1.08965e+08 )
									ret := 0.200000
							if( Negative_Money_Flow > 716385 )
								if( Negative_Money_Flow <= 1.14316e+07 )
									ret := 0.095745
								if( Negative_Money_Flow > 1.14316e+07 )
									ret := -0.888889 // sell
						if( MFI_High > -25.1798 )
							if( Negative_Money_Flow_Sum <= 8.15666e+07 )
								if( Typical_Price <= 0.629067 )
									ret := -1.000000 // sell
								if( Typical_Price > 0.629067 )
									ret := -0.609756
							if( Negative_Money_Flow_Sum > 8.15666e+07 )
								if( Positive_Money_Flow_Sum <= 2.30637e+08 )
									ret := 0.133333
								if( Positive_Money_Flow_Sum > 2.30637e+08 )
									ret := -1.000000 // sell
					if( Raw_Money_Flow > 1.42034e+07 )
						if( Typical_Price <= 0.795428 )
							if( Raw_Money_Flow <= 3.60394e+07 )
								if( Negative_Money_Flow <= 1.3589e+06 )
									ret := -0.527778
								if( Negative_Money_Flow > 1.3589e+06 )
									ret := 0.319444
							if( Raw_Money_Flow > 3.60394e+07 )
								if( Negative_Money_Flow_Sum <= 7.90602e+07 )
									ret := 0.285714
								if( Negative_Money_Flow_Sum > 7.90602e+07 )
									ret := 1.000000 // buy
						if( Typical_Price > 0.795428 )
							if( MFI_High <= -25.8327 )
								ret := -0.333333
							if( MFI_High > -25.8327 )
								if( Negative_Money_Flow <= 2.16628e+07 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 2.16628e+07 )
									ret := -0.750000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_XRPUSDT_15Min_d2898c74(Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum)

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


